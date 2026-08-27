import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.PrivateKey;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class aja implements abk, so {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final apf d = apf.a();
   private final byte[] e;
   final MinecraftServer f;
   final sd g;
   aja.a h = aja.a.a;
   private int i;
   @Nullable
   GameProfile j;
   private final String k = "";
   @Nullable
   private aig l;

   public aja(MinecraftServer $$0, sd $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(d.f());
   }

   @Override
   public void c() {
      if (this.h == aja.a.e) {
         this.d();
      } else if (this.h == aja.a.f) {
         aig $$0 = this.f.ac().a(this.j.getId());
         if ($$0 == null) {
            this.h = aja.a.e;
            this.a(this.l);
            this.l = null;
         }
      }

      if (this.i++ == 600) {
         this.b(sw.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean a() {
      return this.g.h();
   }

   public void b(sw $$0) {
      try {
         b.info("Disconnecting {}: {}", this.e(), $$0.getString());
         this.g.a(new abj($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   public void d() {
      if (!this.j.isComplete()) {
         this.j = this.a(this.j);
      }

      sw $$0 = this.f.ac().a(this.g.c(), this.j);
      if ($$0 != null) {
         this.b($$0);
      } else {
         this.h = aja.a.g;
         if (this.f.av() >= 0 && !this.g.d()) {
            this.g.a(new abi(this.f.av()), sl.a(() -> this.g.a(this.f.av(), true)));
         }

         this.g.a(new abg(this.j));
         aig $$1 = this.f.ac().a(this.j.getId());

         try {
            aig $$2 = this.f.ac().e(this.j);
            if ($$1 != null) {
               this.h = aja.a.f;
               this.l = $$2;
            } else {
               this.a($$2);
            }
         } catch (Exception var5) {
            b.error("Couldn't place player in world", var5);
            sw $$4 = sw.c("multiplayer.disconnect.invalid_player_data");
            this.g.a(new vs($$4));
            this.g.a($$4);
         }
      }
   }

   private void a(aig $$0) {
      this.f.ac().a(this.g, $$0);
   }

   @Override
   public void a(sw $$0) {
      b.info("{} lost connection: {}", this.e(), $$0.getString());
   }

   public String e() {
      return this.j != null ? this.j + " (" + this.g.c() + ")" : String.valueOf(this.g.c());
   }

   @Override
   public void a(abm $$0) {
      Validate.validState(this.h == aja.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(a($$0.a()), "Invalid characters in username", new Object[0]);
      GameProfile $$1 = this.f.N();
      if ($$1 != null && $$0.a().equalsIgnoreCase($$1.getName())) {
         this.j = $$1;
         this.h = aja.a.e;
      } else {
         this.j = new GameProfile(null, $$0.a());
         if (this.f.U() && !this.g.d()) {
            this.h = aja.a.b;
            this.g.a(new abh("", this.f.L().getPublic().getEncoded(), this.e));
         } else {
            this.h = aja.a.e;
         }
      }
   }

   public static boolean a(String $$0) {
      return $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   @Override
   public void a(abn $$0) {
      Validate.validState(this.h == aja.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.L().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = anz.a(2, $$2);
         Cipher $$4 = anz.a(1, $$2);
         $$5 = new BigInteger(anz.a("", this.f.L().getPublic(), $$2)).toString(16);
         this.h = aja.a.c;
         this.g.a($$3, $$4);
      } catch (aoa var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            GameProfile $$0 = aja.this.j;

            try {
               aja.this.j = aja.this.f.am().hasJoinedServer(new GameProfile(null, $$0.getName()), $$5, this.a());
               if (aja.this.j != null) {
                  aja.b.info("UUID of player {} is {}", aja.this.j.getName(), aja.this.j.getId());
                  aja.this.h = aja.a.e;
               } else if (aja.this.f.O()) {
                  aja.b.warn("Failed to verify username but will let them in anyway!");
                  aja.this.j = $$0;
                  aja.this.h = aja.a.e;
               } else {
                  aja.this.b(sw.c("multiplayer.disconnect.unverified_username"));
                  aja.b.error("Username '{}' tried to join with an invalid session", $$0.getName());
               }
            } catch (AuthenticationUnavailableException var3) {
               if (aja.this.f.O()) {
                  aja.b.warn("Authentication servers are down but will let them in anyway!");
                  aja.this.j = $$0;
                  aja.this.h = aja.a.e;
               } else {
                  aja.this.b(sw.c("multiplayer.disconnect.authservers_down"));
                  aja.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = aja.this.g.c();
            return aja.this.f.V() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(abl $$0) {
      this.b(sw.c("multiplayer.disconnect.unexpected_query_response"));
   }

   protected GameProfile a(GameProfile $$0) {
      UUID $$1 = hy.a($$0.getName());
      return new GameProfile($$1, $$0.getName());
   }

   static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
