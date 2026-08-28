import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgv {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fgv.a> b;

   public static CompletableFuture<fgv.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fgv.a> $$0) {
      fgv.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fgv.a> b() {
      fml $$0 = flz.Q().X();
      return $$0.g() != fml.a.c ? CompletableFuture.completedFuture(new fgv.a(fgv.b.d)) : CompletableFuture.supplyAsync(() -> {
         fhb $$0x = fhb.a();

         try {
            if ($$0x.g() != fhb.a.a) {
               return new fgv.a(fgv.b.b);
            } else {
               return !$$0x.f() ? new fgv.a(fgv.b.c) : new fgv.a(fgv.b.a);
            }
         } catch (fix var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fgv.a(fgv.b.d) : new fgv.a(var2);
         }
      }, ae.h());
   }

   public static record a(fgv.b a, @Nullable fix b) {
      public a(fgv.b $$0) {
         this($$0, null);
      }

      public a(fix $$0) {
         this(fgv.b.e, $$0);
      }

      @Nullable
      public ftr a(ftr $$0) {
         return (ftr)(switch (this.a) {
            case a -> null;
            case b -> new fjk($$0);
            case c -> new fju($$0);
            case d -> new fjp(xk.c("mco.error.invalid.session.title"), xk.c("mco.error.invalid.session.message"), $$0);
            case e -> new fjp(Objects.requireNonNull(this.b), $$0);
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
