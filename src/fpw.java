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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.client.ClientBrandRetriever;
import org.slf4j.Logger;

public class fpw implements agw {
   private static final Logger a = LogUtils.getLogger();
   private final exh b;
   @Nullable
   private final fqi c;
   @Nullable
   private final ffe d;
   private final Consumer<vq> e;
   private final uo f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<aiy, byte[]> j;
   private final boolean k;
   private final AtomicReference<fpw.a> l = new AtomicReference<>(fpw.a.a);

   public fpw(uo $$0, exh $$1, @Nullable fqi $$2, @Nullable ffe $$3, boolean $$4, @Nullable Duration $$5, Consumer<vq> $$6, @Nullable fql $$7) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
      this.j = $$7 != null ? new HashMap<>($$7.a()) : new HashMap<>();
      this.k = $$7 != null;
   }

   private void a(fpw.a $$0) {
      fpw.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(agz $$0) {
      this.a(fpw.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ahh $$7;
      try {
         SecretKey $$1 = avf.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(avf.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = avf.a(2, $$1);
         $$5 = avf.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ahh($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.g().submit(() -> {
            vq $$4x = this.b($$3);
            if ($$4x != null) {
               if (this.c == null || !this.c.d()) {
                  this.f.a($$4x);
                  return;
               }

               a.warn($$4x.getString());
            }

            this.a($$7, $$4, $$5);
         });
      } else {
         this.a($$7, $$4, $$5);
      }
   }

   private void a(ahh $$0, Cipher $$1, Cipher $$2) {
      this.a(fpw.a.c);
      this.f.a($$0, ux.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private vq b(String $$0) {
      try {
         this.e().joinServer(this.b.V().b(), this.b.V().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return vq.a("disconnect.loginFailedInfo", vq.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return vq.a("disconnect.loginFailedInfo", vq.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return vq.a("disconnect.loginFailedInfo", vq.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return vq.a("disconnect.loginFailedInfo", vq.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return vq.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.ak();
   }

   @Override
   public void a(agy $$0) {
      this.a(fpw.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(zw.b, new fpv(this.b, this.f, new fqb($$1, this.b.t().a(this.g, this.h, this.i), fpz.a().a(), cju.h, null, this.c, this.d, this.j)));
      this.f.a(ahi.a);
      this.f.a(zw.a);
      this.f.a(new yq(new yw(ClientBrandRetriever.getClientModName())));
      this.f.a(new yp(this.b.m.at()));
   }

   @Override
   public void a(vq $$0) {
      vq $$1 = this.k ? vp.q : vp.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gms(this.d, $$1, $$0));
      } else {
         this.b.a(new feg(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ahb $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(aha $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(agx $$0) {
      this.e.accept(vq.c("connect.negotiating"));
      this.f.a(new ahf($$0.b(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(aab $$0) {
      this.f.a(new aae($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(vq.c("connect.connecting"), Set.of()),
      b(vq.c("connect.authorizing"), Set.of(a)),
      c(vq.c("connect.encrypting"), Set.of(b)),
      d(vq.c("connect.joining"), Set.of(c, a));

      final vq e;
      final Set<fpw.a> f;

      private a(vq $$0, Set<fpw.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
