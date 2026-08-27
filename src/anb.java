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

public class anb implements aes, ug {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final ur d = ur.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final ts g;
   private volatile anb.a h = anb.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public anb(MinecraftServer $$0, ts $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(ato.a().f());
   }

   @Override
   public void e() {
      if (this.h == anb.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == anb.a.f && !this.a(Objects.requireNonNull(this.k))) {
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
         this.g.a(new aer($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ac().a($$0.getId()) != null;
   }

   @Override
   public void a(ur $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   public String f() {
      String $$0 = this.g.a(this.f.be());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(aeu $$0) {
      Validate.validState(this.h == anb.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(cdm.c($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.N();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.U() && !this.g.g()) {
            this.h = anb.a.b;
            this.g.a(new aep("", this.f.L().getPublic().getEncoded(), this.e));
         } else {
            this.b(iv.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = anb.a.e;
   }

   private void c(GameProfile $$0) {
      apq $$1 = this.f.ac();
      ur $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.av() >= 0 && !this.g.g()) {
            this.g.a(new aeq(this.f.av()), ub.a(() -> this.g.a(this.f.av(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = anb.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = anb.a.g;
      this.g.a(new aeo($$0));
   }

   @Override
   public void a(aev $$0) {
      Validate.validState(this.h == anb.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.L().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = ash.a(2, $$2);
         Cipher $$4 = ash.a(1, $$2);
         $$5 = new BigInteger(ash.a("", this.f.L().getPublic(), $$2)).toString(16);
         this.h = anb.a.c;
         this.g.a($$3, $$4);
      } catch (asi var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(anb.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = anb.this.f.am().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  anb.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  anb.this.b($$2);
               } else if (anb.this.f.O()) {
                  anb.b.warn("Failed to verify username but will let them in anyway!");
                  anb.this.b(iv.b($$0));
               } else {
                  anb.this.b(ur.c("multiplayer.disconnect.unverified_username"));
                  anb.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (anb.this.f.O()) {
                  anb.b.warn("Authentication servers are down but will let them in anyway!");
                  anb.this.b(iv.b($$0));
               } else {
                  anb.this.b(ur.c("multiplayer.disconnect.authservers_down"));
                  anb.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = anb.this.g.f();
            return anb.this.f.V() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(aet $$0) {
      this.b(d);
   }

   @Override
   public void a(aew $$0) {
      Validate.validState(this.h == anb.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      amp $$1 = amp.a(Objects.requireNonNull(this.k));
      amx $$2 = new amx(this.f, this.g, $$1);
      this.g.a($$2);
      $$2.m();
      this.h = anb.a.h;
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
