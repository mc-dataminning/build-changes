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

public class apx implements ahe, ve {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private final byte[] d;
   final MinecraftServer e;
   final uo f;
   private volatile apx.a g = apx.a.a;
   private int h;
   @Nullable
   String i;
   @Nullable
   private GameProfile j;
   private final String k = "";
   private final boolean l;

   public apx(MinecraftServer $$0, uo $$1, boolean $$2) {
      this.e = $$0;
      this.f = $$1;
      this.d = Ints.toByteArray(awp.a().f());
      this.l = $$2;
   }

   @Override
   public void e() {
      if (this.g == apx.a.e) {
         this.c(Objects.requireNonNull(this.j));
      }

      if (this.g == apx.a.f && !this.a(Objects.requireNonNull(this.j))) {
         this.d(this.j);
      }

      if (this.h++ == 600) {
         this.b(vq.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   public void b(vq $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.f.a(new ahb($$0));
         this.f.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.e.ag().a($$0.getId()) != null;
   }

   @Override
   public void a(vq $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   @Override
   public String f() {
      String $$0 = this.f.a(this.e.bl());
      return this.i != null ? this.i + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(ahg $$0) {
      Validate.validState(this.g == apx.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(chl.c($$0.b()), "Invalid characters in username", new Object[0]);
      this.i = $$0.b();
      GameProfile $$1 = this.e.R();
      if ($$1 != null && this.i.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.e.Y() && !this.f.e()) {
            this.g = apx.a.b;
            this.f.a(new agz("", this.e.P().getPublic().getEncoded(), this.d, true));
         } else {
            this.b(jc.b(this.i));
         }
      }
   }

   void b(GameProfile $$0) {
      this.j = $$0;
      this.g = apx.a.e;
   }

   private void c(GameProfile $$0) {
      aso $$1 = this.e.ag();
      vq $$2 = $$1.a(this.f.d(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.e.az() >= 0 && !this.f.e()) {
            this.f.a(new aha(this.e.az()), ux.a(() -> this.f.a(this.e.az(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.g = apx.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.g = apx.a.g;
      this.f.a(new agy($$0));
   }

   @Override
   public void a(ahh $$0) {
      Validate.validState(this.g == apx.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.e.P().getPrivate();
         if (!$$0.a(this.d, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = avg.a(2, $$2);
         Cipher $$4 = avg.a(1, $$2);
         $$5 = new BigInteger(avg.a("", this.e.P().getPublic(), $$2)).toString(16);
         this.g = apx.a.c;
         this.f.a($$3, $$4);
      } catch (avh var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(apx.this.i, "Player name not initialized");

            try {
               ProfileResult $$1 = apx.this.e.aq().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  apx.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  apx.this.b($$2);
               } else if (apx.this.e.S()) {
                  apx.b.warn("Failed to verify username but will let them in anyway!");
                  apx.this.b(jc.b($$0));
               } else {
                  apx.this.b(vq.c("multiplayer.disconnect.unverified_username"));
                  apx.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (apx.this.e.S()) {
                  apx.b.warn("Authentication servers are down but will let them in anyway!");
                  apx.this.b(jc.b($$0));
               } else {
                  apx.this.b(vq.c("multiplayer.disconnect.authservers_down"));
                  apx.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = apx.this.f.d();
            return apx.this.e.Z() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(ahf $$0) {
      this.b(aps.b);
   }

   @Override
   public void a(ahi $$0) {
      Validate.validState(this.g == apx.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.f.a(zw.b);
      apl $$1 = apl.a(Objects.requireNonNull(this.j), this.l);
      apt $$2 = new apt(this.e, this.f, $$1);
      this.f.a(zw.a, $$2);
      $$2.m();
      this.g = apx.a.h;
   }

   @Override
   public void a(p $$0) {
      $$0.a("Login phase", () -> this.g.toString());
   }

   @Override
   public void a(aae $$0) {
      this.b(aps.b);
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
