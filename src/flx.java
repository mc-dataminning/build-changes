import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flx {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<flx.a> b;

   public static CompletableFuture<flx.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<flx.a> $$0) {
      flx.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<flx.a> b() {
      frp $$0 = frd.Q().X();
      return $$0.g() != frp.a.c ? CompletableFuture.completedFuture(new flx.a(flx.b.d)) : CompletableFuture.supplyAsync(() -> {
         fmd $$0x = fmd.a();

         try {
            if ($$0x.h() != fmd.a.a) {
               return new flx.a(flx.b.b);
            } else {
               return !$$0x.g() ? new flx.a(flx.b.c) : new flx.a(flx.b.a);
            }
         } catch (fnz var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new flx.a(flx.b.d) : new flx.a(var2);
         }
      }, ag.i());
   }

   public static record a(flx.b a, @Nullable fnz b) {
      public a(flx.b $$0) {
         this($$0, null);
      }

      public a(fnz $$0) {
         this(flx.b.e, $$0);
      }

      @Nullable
      public gad a(gad $$0) {
         return (gad)(switch (this.a) {
            case a -> null;
            case b -> new fom($$0);
            case c -> new fox($$0);
            case d -> new fos(xa.c("mco.error.invalid.session.title"), xa.c("mco.error.invalid.session.message"), $$0);
            case e -> new fos(Objects.requireNonNull(this.b), $$0);
         });
      }
   }

   public static enum b {
      a,
      b,
      c,
      d,
      e;
   }
}
