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

public class fnj implements afj {
   private static final Logger a = LogUtils.getLogger();
   private final eva b;
   @Nullable
   private final fnv c;
   @Nullable
   private final fct d;
   private final Consumer<vd> e;
   private final ue f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fnj.a> j = new AtomicReference<>(fnj.a.a);

   public fnj(ue $$0, eva $$1, @Nullable fnv $$2, @Nullable fct $$3, boolean $$4, @Nullable Duration $$5, Consumer<vd> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fnj.a $$0) {
      fnj.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(afm $$0) {
      this.a(fnj.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      afs $$7;
      try {
         SecretKey $$1 = atg.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(atg.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = atg.a(2, $$1);
         $$5 = atg.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new afs($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      atz.a.submit(() -> {
         vd $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fnj.a.c);
         this.f.a($$7, un.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private vd b(String $$0) {
      try {
         this.e().joinServer(this.b.U().b(), this.b.U().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return vd.a("disconnect.loginFailedInfo", vd.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return vd.a("disconnect.loginFailedInfo", vd.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return vd.a("disconnect.loginFailedInfo", vd.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return vd.a("disconnect.loginFailedInfo", vd.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return vd.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.aj();
   }

   @Override
   public void a(afl $$0) {
      this.a(fnj.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new aft());
      this.f.a(new fni(this.b, this.f, new fno($$1, this.b.t().a(this.g, this.h, this.i), fnm.a().a(), chn.h, null, this.c, this.d)));
      this.f.a(new xp(new xv(ClientBrandRetriever.getClientModName())));
      this.f.a(new xo(this.b.m.at()));
   }

   @Override
   public void a(vd $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gjy(this.d, vc.q, $$0));
      } else {
         this.b.a(new fbv(this.d, vc.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(afo $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(afn $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(afk $$0) {
      this.e.accept(vd.c("connect.negotiating"));
      this.f.a(new afq($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   static enum a {
      a(vd.c("connect.connecting"), Set.of()),
      b(vd.c("connect.authorizing"), Set.of(a)),
      c(vd.c("connect.encrypting"), Set.of(b)),
      d(vd.c("connect.joining"), Set.of(c, a));

      final vd e;
      final Set<fnj.a> f;

      private a(vd $$0, Set<fnj.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
