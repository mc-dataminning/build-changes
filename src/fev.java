import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.PublicKey;
import java.time.Duration;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.slf4j.Logger;

public class fev implements abe {
   private static final Logger a = LogUtils.getLogger();
   private final enn b;
   @Nullable
   private final ffd c;
   @Nullable
   private final euq d;
   private final Consumer<sw> e;
   private final sd f;
   private GameProfile g;
   private final boolean h;
   @Nullable
   private final Duration i;
   @Nullable
   private String j;

   public fev(sd $$0, enn $$1, @Nullable ffd $$2, @Nullable euq $$3, boolean $$4, @Nullable Duration $$5, Consumer<sw> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.h = $$4;
      this.i = $$5;
   }

   @Override
   public void a(abh $$0) {
      Cipher $$4;
      Cipher $$5;
      String $$3;
      abn $$7;
      try {
         SecretKey $$1 = anz.a();
         PublicKey $$2 = $$0.c();
         $$3 = new BigInteger(anz.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = anz.a(2, $$1);
         $$5 = anz.a(1, $$1);
         byte[] $$6 = $$0.d();
         $$7 = new abn($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      this.e.accept(sw.c("connect.authorizing"));
      aos.a.submit(() -> {
         sw $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.e.accept(sw.c("connect.encrypting"));
         this.f.a($$7, sl.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private sw b(String $$0) {
      try {
         this.c().joinServer(this.b.U().h(), this.b.U().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return sw.a("disconnect.loginFailedInfo", sw.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return sw.a("disconnect.loginFailedInfo", sw.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return sw.a("disconnect.loginFailedInfo", sw.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (UserBannedException var6) {
         return sw.a("disconnect.loginFailedInfo", sw.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return sw.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService c() {
      return this.b.aj();
   }

   @Override
   public void a(abg $$0) {
      this.e.accept(sw.c("connect.joining"));
      this.g = $$0.a();
      this.f.a(se.b);
      this.f.a(new fex(this.b, this.d, this.f, this.c, this.g, this.b.t().a(this.h, this.i, this.j)));
   }

   @Override
   public void a(sw $$0) {
      if (this.d != null && this.d instanceof gan) {
         this.b.a(new gaj(this.d, sv.p, $$0));
      } else {
         this.b.a(new ett(this.d, sv.p, $$0));
      }
   }

   @Override
   public boolean a() {
      return this.f.h();
   }

   @Override
   public void a(abj $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(abi $$0) {
      if (!this.f.d()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(abf $$0) {
      this.e.accept(sw.c("connect.negotiating"));
      this.f.a(new abl($$0.a(), null));
   }

   public void a(String $$0) {
      this.j = $$0;
   }
}
