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

public class aqg implements ahm, vi {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private final byte[] d;
   final MinecraftServer e;
   final us f;
   private volatile aqg.a g = aqg.a.a;
   private int h;
   @Nullable
   String i;
   @Nullable
   private GameProfile j;
   private final String k = "";
   private final boolean l;

   public aqg(MinecraftServer $$0, us $$1, boolean $$2) {
      this.e = $$0;
      this.f = $$1;
      this.d = Ints.toByteArray(axd.a().f());
      this.l = $$2;
   }

   @Override
   public void e() {
      if (this.g == aqg.a.e) {
         this.c(Objects.requireNonNull(this.j));
      }

      if (this.g == aqg.a.f && !this.a(Objects.requireNonNull(this.j))) {
         this.d(this.j);
      }

      if (this.h++ == 600) {
         this.b(vu.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   public void b(vu $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.f.a(new ahj($$0));
         this.f.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.e.ah().a($$0.getId()) != null;
   }

   @Override
   public void a(vu $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   @Override
   public String f() {
      String $$0 = this.f.a(this.e.bn());
      return this.i != null ? this.i + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(aho $$0) {
      Validate.validState(this.g == aqg.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(ciu.c($$0.b()), "Invalid characters in username", new Object[0]);
      this.i = $$0.b();
      GameProfile $$1 = this.e.S();
      if ($$1 != null && this.i.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.e.Z() && !this.f.e()) {
            this.g = aqg.a.b;
            this.f.a(new ahh("", this.e.Q().getPublic().getEncoded(), this.d, true));
         } else {
            this.b(jf.b(this.i));
         }
      }
   }

   void b(GameProfile $$0) {
      this.j = $$0;
      this.g = aqg.a.e;
   }

   private void c(GameProfile $$0) {
      atb $$1 = this.e.ah();
      vu $$2 = $$1.a(this.f.d(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.e.aA() >= 0 && !this.f.e()) {
            this.f.a(new ahi(this.e.aA()), vb.a(() -> this.f.a(this.e.aA(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.g = aqg.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.g = aqg.a.g;
      this.f.a(new ahg($$0));
   }

   @Override
   public void a(ahp $$0) {
      Validate.validState(this.g == aqg.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.e.Q().getPrivate();
         if (!$$0.a(this.d, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = avu.a(2, $$2);
         Cipher $$4 = avu.a(1, $$2);
         $$5 = new BigInteger(avu.a("", this.e.Q().getPublic(), $$2)).toString(16);
         this.g = aqg.a.c;
         this.f.a($$3, $$4);
      } catch (avv var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(aqg.this.i, "Player name not initialized");

            try {
               ProfileResult $$1 = aqg.this.e.ar().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  aqg.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  aqg.this.b($$2);
               } else if (aqg.this.e.T()) {
                  aqg.b.warn("Failed to verify username but will let them in anyway!");
                  aqg.this.b(jf.b($$0));
               } else {
                  aqg.this.b(vu.c("multiplayer.disconnect.unverified_username"));
                  aqg.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (aqg.this.e.T()) {
                  aqg.b.warn("Authentication servers are down but will let them in anyway!");
                  aqg.this.b(jf.b($$0));
               } else {
                  aqg.this.b(vu.c("multiplayer.disconnect.authservers_down"));
                  aqg.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = aqg.this.f.d();
            return aqg.this.e.aa() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(ahn $$0) {
      this.b(aqb.b);
   }

   @Override
   public void a(ahq $$0) {
      Validate.validState(this.g == aqg.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.f.a(aab.b);
      apu $$1 = apu.a(Objects.requireNonNull(this.j), this.l);
      aqc $$2 = new aqc(this.e, this.f, $$1);
      this.f.a(aab.a, $$2);
      $$2.m();
      this.g = aqg.a.h;
   }

   @Override
   public void a(p $$0) {
      $$0.a("Login phase", () -> this.g.toString());
   }

   @Override
   public void a(aak $$0) {
      this.b(aqb.b);
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
