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

public class fiw implements adf {
   private static final Logger a = LogUtils.getLogger();
   private final eqv b;
   @Nullable
   private final fjh c;
   @Nullable
   private final eyk d;
   private final Consumer<tm> e;
   private final sn f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fiw.a> j = new AtomicReference<>(fiw.a.a);

   public fiw(sn $$0, eqv $$1, @Nullable fjh $$2, @Nullable eyk $$3, boolean $$4, @Nullable Duration $$5, Consumer<tm> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fiw.a $$0) {
      fiw.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(adi $$0) {
      this.a(fiw.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ado $$7;
      try {
         SecretKey $$1 = aqx.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(aqx.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = aqx.a(2, $$1);
         $$5 = aqx.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new ado($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      arp.a.submit(() -> {
         tm $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fiw.a.c);
         this.f.a($$7, sw.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private tm b(String $$0) {
      try {
         this.e().joinServer(this.b.V().b(), this.b.V().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return tm.a("disconnect.loginFailedInfo", tm.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return tm.a("disconnect.loginFailedInfo", tm.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return tm.a("disconnect.loginFailedInfo", tm.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return tm.a("disconnect.loginFailedInfo", tm.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return tm.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.ak();
   }

   @Override
   public void a(adh $$0) {
      this.a(fiw.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new adp());
      this.f.a(new fiv(this.b, this.f, new fjb($$1, this.b.u().a(this.g, this.h, this.i), fiz.a().a(), cee.g, null, this.c, this.d)));
      this.f.a(new vq(new vw(ClientBrandRetriever.getClientModName())));
      this.f.a(new vp(this.b.m.as()));
   }

   @Override
   public void a(tm $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gex(this.d, tl.q, $$0));
      } else {
         this.b.a(new exm(this.d, tl.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(adk $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(adj $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(adg $$0) {
      this.e.accept(tm.c("connect.negotiating"));
      this.f.a(new adm($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   static enum a {
      a(tm.c("connect.connecting"), Set.of()),
      b(tm.c("connect.authorizing"), Set.of(a)),
      c(tm.c("connect.encrypting"), Set.of(b)),
      d(tm.c("connect.joining"), Set.of(c, a));

      final tm e;
      final Set<fiw.a> f;

      private a(tm $$0, Set<fiw.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
