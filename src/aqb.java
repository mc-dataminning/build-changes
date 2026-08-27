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

public class aqb implements ahi, vg {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private final byte[] d;
   final MinecraftServer e;
   final uq f;
   private volatile aqb.a g = aqb.a.a;
   private int h;
   @Nullable
   String i;
   @Nullable
   private GameProfile j;
   private final String k = "";
   private final boolean l;

   public aqb(MinecraftServer $$0, uq $$1, boolean $$2) {
      this.e = $$0;
      this.f = $$1;
      this.d = Ints.toByteArray(awt.a().f());
      this.l = $$2;
   }

   @Override
   public void e() {
      if (this.g == aqb.a.e) {
         this.c(Objects.requireNonNull(this.j));
      }

      if (this.g == aqb.a.f && !this.a(Objects.requireNonNull(this.j))) {
         this.d(this.j);
      }

      if (this.h++ == 600) {
         this.b(vs.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   public void b(vs $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.f.a(new ahf($$0));
         this.f.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.e.ah().a($$0.getId()) != null;
   }

   @Override
   public void a(vs $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   @Override
   public String f() {
      String $$0 = this.f.a(this.e.bn());
      return this.i != null ? this.i + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(ahk $$0) {
      Validate.validState(this.g == aqb.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(cia.c($$0.b()), "Invalid characters in username", new Object[0]);
      this.i = $$0.b();
      GameProfile $$1 = this.e.S();
      if ($$1 != null && this.i.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.e.Z() && !this.f.e()) {
            this.g = aqb.a.b;
            this.f.a(new ahd("", this.e.Q().getPublic().getEncoded(), this.d, true));
         } else {
            this.b(je.b(this.i));
         }
      }
   }

   void b(GameProfile $$0) {
      this.j = $$0;
      this.g = aqb.a.e;
   }

   private void c(GameProfile $$0) {
      ass $$1 = this.e.ah();
      vs $$2 = $$1.a(this.f.d(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.e.aA() >= 0 && !this.f.e()) {
            this.f.a(new ahe(this.e.aA()), uz.a(() -> this.f.a(this.e.aA(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.g = aqb.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.g = aqb.a.g;
      this.f.a(new ahc($$0));
   }

   @Override
   public void a(ahl $$0) {
      Validate.validState(this.g == aqb.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.e.Q().getPrivate();
         if (!$$0.a(this.d, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = avk.a(2, $$2);
         Cipher $$4 = avk.a(1, $$2);
         $$5 = new BigInteger(avk.a("", this.e.Q().getPublic(), $$2)).toString(16);
         this.g = aqb.a.c;
         this.f.a($$3, $$4);
      } catch (avl var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(aqb.this.i, "Player name not initialized");

            try {
               ProfileResult $$1 = aqb.this.e.ar().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  aqb.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  aqb.this.b($$2);
               } else if (aqb.this.e.T()) {
                  aqb.b.warn("Failed to verify username but will let them in anyway!");
                  aqb.this.b(je.b($$0));
               } else {
                  aqb.this.b(vs.c("multiplayer.disconnect.unverified_username"));
                  aqb.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (aqb.this.e.T()) {
                  aqb.b.warn("Authentication servers are down but will let them in anyway!");
                  aqb.this.b(je.b($$0));
               } else {
                  aqb.this.b(vs.c("multiplayer.disconnect.authservers_down"));
                  aqb.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = aqb.this.f.d();
            return aqb.this.e.aa() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(ahj $$0) {
      this.b(apw.b);
   }

   @Override
   public void a(ahm $$0) {
      Validate.validState(this.g == aqb.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.f.a(zy.b);
      app $$1 = app.a(Objects.requireNonNull(this.j), this.l);
      apx $$2 = new apx(this.e, this.f, $$1);
      this.f.a(zy.a, $$2);
      $$2.m();
      this.g = aqb.a.h;
   }

   @Override
   public void a(p $$0) {
      $$0.a("Login phase", () -> this.g.toString());
   }

   @Override
   public void a(aag $$0) {
      this.b(apw.b);
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
