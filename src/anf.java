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

public class anf implements aeu, ug {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final ur d = ur.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final ts g;
   private volatile anf.a h = anf.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public anf(MinecraftServer $$0, ts $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(ats.a().f());
   }

   @Override
   public void e() {
      if (this.h == anf.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == anf.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(ur.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(ur $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new aet($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ae().a($$0.getId()) != null;
   }

   @Override
   public void a(ur $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   public String f() {
      String $$0 = this.g.a(this.f.bj());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(aew $$0) {
      Validate.validState(this.h == anf.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(cdu.c($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.P();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.W() && !this.g.g()) {
            this.h = anf.a.b;
            this.g.a(new aer("", this.f.N().getPublic().getEncoded(), this.e));
         } else {
            this.b(iv.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = anf.a.e;
   }

   private void c(GameProfile $$0) {
      apu $$1 = this.f.ae();
      ur $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.ax() >= 0 && !this.g.g()) {
            this.g.a(new aes(this.f.ax()), ub.a(() -> this.g.a(this.f.ax(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = anf.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = anf.a.g;
      this.g.a(new aeq($$0));
   }

   @Override
   public void a(aex $$0) {
      Validate.validState(this.h == anf.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.N().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = asl.a(2, $$2);
         Cipher $$4 = asl.a(1, $$2);
         $$5 = new BigInteger(asl.a("", this.f.N().getPublic(), $$2)).toString(16);
         this.h = anf.a.c;
         this.g.a($$3, $$4);
      } catch (asm var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(anf.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = anf.this.f.ao().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  anf.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  anf.this.b($$2);
               } else if (anf.this.f.Q()) {
                  anf.b.warn("Failed to verify username but will let them in anyway!");
                  anf.this.b(iv.b($$0));
               } else {
                  anf.this.b(ur.c("multiplayer.disconnect.unverified_username"));
                  anf.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (anf.this.f.Q()) {
                  anf.b.warn("Authentication servers are down but will let them in anyway!");
                  anf.this.b(iv.b($$0));
               } else {
                  anf.this.b(ur.c("multiplayer.disconnect.authservers_down"));
                  anf.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = anf.this.g.f();
            return anf.this.f.X() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(aev $$0) {
      this.b(d);
   }

   @Override
   public void a(aey $$0) {
      Validate.validState(this.h == anf.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      amt $$1 = amt.a(Objects.requireNonNull(this.k));
      anb $$2 = new anb(this.f, this.g, $$1);
      this.g.a($$2);
      $$2.m();
      this.h = anf.a.h;
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
