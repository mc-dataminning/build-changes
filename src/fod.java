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

public class fod implements afn {
   private static final Logger a = LogUtils.getLogger();
   private final evr b;
   @Nullable
   private final fop c;
   @Nullable
   private final fdm d;
   private final Consumer<vg> e;
   private final uh f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fod.a> j = new AtomicReference<>(fod.a.a);

   public fod(uh $$0, evr $$1, @Nullable fop $$2, @Nullable fdm $$3, boolean $$4, @Nullable Duration $$5, Consumer<vg> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fod.a $$0) {
      fod.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(afq $$0) {
      this.a(fod.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      afw $$7;
      try {
         SecretKey $$1 = atn.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(atn.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = atn.a(2, $$1);
         $$5 = atn.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new afw($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      ac.g().submit(() -> {
         vg $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fod.a.c);
         this.f.a($$7, uq.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private vg b(String $$0) {
      try {
         this.e().joinServer(this.b.V().b(), this.b.V().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return vg.a("disconnect.loginFailedInfo", vg.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return vg.a("disconnect.loginFailedInfo", vg.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return vg.a("disconnect.loginFailedInfo", vg.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return vg.a("disconnect.loginFailedInfo", vg.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return vg.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.ak();
   }

   @Override
   public void a(afp $$0) {
      this.a(fod.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new afx());
      this.f.a(new foc(this.b, this.f, new foi($$1, this.b.t().a(this.g, this.h, this.i), fog.a().a(), cic.h, null, this.c, this.d)));
      this.f.a(new xt(new xz(ClientBrandRetriever.getClientModName())));
      this.f.a(new xs(this.b.m.at()));
   }

   @Override
   public void a(vg $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gkz(this.d, vf.q, $$0));
      } else {
         this.b.a(new fco(this.d, vf.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(afs $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(afr $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(afo $$0) {
      this.e.accept(vg.c("connect.negotiating"));
      this.f.a(new afu($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.j.get().toString());
   }

   static enum a {
      a(vg.c("connect.connecting"), Set.of()),
      b(vg.c("connect.authorizing"), Set.of(a)),
      c(vg.c("connect.encrypting"), Set.of(b)),
      d(vg.c("connect.joining"), Set.of(c, a));

      final vg e;
      final Set<fod.a> f;

      private a(vg $$0, Set<fod.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
