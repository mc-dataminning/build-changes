import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.PrivateKey;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class arp implements ais, wl {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private final byte[] d;
   final MinecraftServer e;
   final vv f;
   private volatile arp.a g = arp.a.a;
   private int h;
   @Nullable
   String i;
   @Nullable
   private GameProfile j;
   private final String k = "";
   private final boolean l;

   public arp(MinecraftServer $$0, vv $$1, boolean $$2) {
      this.e = $$0;
      this.f = $$1;
      this.d = Ints.toByteArray(aym.a().f());
      this.l = $$2;
   }

   @Override
   public void e() {
      if (this.g == arp.a.e) {
         this.c(Objects.requireNonNull(this.j));
      }

      if (this.g == arp.a.f && !this.a(Objects.requireNonNull(this.j))) {
         this.d(this.j);
      }

      if (this.h++ == 600) {
         this.b(wx.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   public void b(wx $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.f.a(new aip($$0));
         this.f.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.e.ah().a($$0.getId()) != null;
   }

   @Override
   public void a(wx $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   @Override
   public String f() {
      String $$0 = this.f.a(this.e.bn());
      return this.i != null ? this.i + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(aiu $$0) {
      Validate.validState(this.g == arp.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(aza.f($$0.b()), "Invalid characters in username", new Object[0]);
      this.i = $$0.b();
      GameProfile $$1 = this.e.S();
      if ($$1 != null && this.i.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.e.Z() && !this.f.e()) {
            this.g = arp.a.b;
            this.f.a(new ain("", this.e.Q().getPublic().getEncoded(), this.d, true));
         } else {
            this.b(jr.b(this.i));
         }
      }
   }

   void b(GameProfile $$0) {
      this.j = $$0;
      this.g = arp.a.e;
   }

   private void c(GameProfile $$0) {
      auk $$1 = this.e.ah();
      wx $$2 = $$1.a(this.f.d(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.e.aA() >= 0 && !this.f.e()) {
            this.f.a(new aio(this.e.aA()), we.a(() -> this.f.a(this.e.aA(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.g = arp.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.g = arp.a.g;
      this.f.a(new aim($$0));
   }

   @Override
   public void a(aiv $$0) {
      Validate.validState(this.g == arp.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.e.Q().getPrivate();
         if (!$$0.a(this.d, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = axd.a(2, $$2);
         Cipher $$4 = axd.a(1, $$2);
         $$5 = new BigInteger(axd.a("", this.e.Q().getPublic(), $$2)).toString(16);
         this.g = arp.a.c;
         this.f.a($$3, $$4);
      } catch (axe var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(arp.this.i, "Player name not initialized");

            try {
               ProfileResult $$1 = arp.this.e.ar().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  arp.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  arp.this.b($$2);
               } else if (arp.this.e.T()) {
                  arp.b.warn("Failed to verify username but will let them in anyway!");
                  arp.this.b(jr.b($$0));
               } else {
                  arp.this.b(wx.c("multiplayer.disconnect.unverified_username"));
                  arp.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (arp.this.e.T()) {
                  arp.b.warn("Authentication servers are down but will let them in anyway!");
                  arp.this.b(jr.b($$0));
               } else {
                  arp.this.b(wx.c("multiplayer.disconnect.authservers_down"));
                  arp.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = arp.this.f.d();
            return arp.this.e.aa() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(ait $$0) {
      this.b(ark.b);
   }

   @Override
   public void a(aiw $$0) {
      Validate.validState(this.g == arp.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.f.a(abf.b);
      arc $$1 = arc.a(Objects.requireNonNull(this.j), this.l);
      arl $$2 = new arl(this.e, this.f, $$1);
      this.f.a(abf.a, $$2);
      $$2.m();
      this.g = arp.a.h;
   }

   @Override
   public void a(p $$0) {
      $$0.a("Login phase", () -> this.g.toString());
   }

   @Override
   public void a(abo $$0) {
      this.b(ark.b);
   }

   static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;
   }
}
