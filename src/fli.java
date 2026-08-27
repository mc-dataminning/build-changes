import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.ForcedUsernameChangeException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.PublicKey;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.client.ClientBrandRetriever;
import org.slf4j.Logger;

public class fli implements aeo {
   private static final Logger a = LogUtils.getLogger();
   private final etd b;
   @Nullable
   private final flu c;
   @Nullable
   private final fau d;
   private final Consumer<ur> e;
   private final ts f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fli.a> j = new AtomicReference<>(fli.a.a);

   public fli(ts $$0, etd $$1, @Nullable flu $$2, @Nullable fau $$3, boolean $$4, @Nullable Duration $$5, Consumer<ur> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fli.a $$0) {
      fli.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aer $$0) {
      this.a(fli.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      aex $$7;
      try {
         SecretKey $$1 = asl.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(asl.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = asl.a(2, $$1);
         $$5 = asl.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new aex($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      atd.a.submit(() -> {
         ur $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fli.a.c);
         this.f.a($$7, ub.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private ur b(String $$0) {
      try {
         this.e().joinServer(this.b.U().b(), this.b.U().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return ur.a("disconnect.loginFailedInfo", ur.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return ur.a("disconnect.loginFailedInfo", ur.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return ur.a("disconnect.loginFailedInfo", ur.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return ur.a("disconnect.loginFailedInfo", ur.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return ur.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.aj();
   }

   @Override
   public void a(aeq $$0) {
      this.a(fli.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new aey());
      this.f.a(new flh(this.b, this.f, new fln($$1, this.b.t().a(this.g, this.h, this.i), fll.a().a(), cgf.h, null, this.c, this.d)));
      this.f.a(new ww(new xc(ClientBrandRetriever.getClientModName())));
      this.f.a(new wv(this.b.m.at()));
   }

   @Override
   public void a(ur $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new ghn(this.d, uq.q, $$0));
      } else {
         this.b.a(new ezw(this.d, uq.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(aet $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(aes $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(aep $$0) {
      this.e.accept(ur.c("connect.negotiating"));
      this.f.a(new aev($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   static enum a {
      a(ur.c("connect.connecting"), Set.of()),
      b(ur.c("connect.authorizing"), Set.of(a)),
      c(ur.c("connect.encrypting"), Set.of(b)),
      d(ur.c("connect.joining"), Set.of(c, a));

      final ur e;
      final Set<fli.a> f;

      private a(ur $$0, Set<fli.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
