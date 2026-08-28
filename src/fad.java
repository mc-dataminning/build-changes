import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fad {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fad.a> b;

   public static CompletableFuture<fad.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fad.a> $$0) {
      fad.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fad.a> b() {
      ffo $$0 = ffa.Q().X();
      return $$0.g() != ffo.a.c ? CompletableFuture.completedFuture(new fad.a(fad.b.d)) : CompletableFuture.supplyAsync(() -> {
         faj $$0x = faj.a();

         try {
            if ($$0x.g() != faj.a.a) {
               return new fad.a(fad.b.b);
            } else {
               return !$$0x.f() ? new fad.a(fad.b.c) : new fad.a(fad.b.a);
            }
         } catch (fbw var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fad.a(fad.b.d) : new fad.a(var2);
         }
      }, ac.h());
   }

   public static record a(fad.b a, @Nullable fbw b) {
      public a(fad.b $$0) {
         this($$0, null);
      }

      public a(fbw $$0) {
         this(fad.b.e, $$0);
      }

      @Nullable
      public fmy a(fmy $$0) {
         return (fmy)(switch (this.a) {
            case a -> null;
            case b -> new fci($$0);
            case c -> new fct($$0);
            case d -> new fcn(xl.c("mco.error.invalid.session.title"), xl.c("mco.error.invalid.session.message"), $$0);
            case e -> new fcn(Objects.requireNonNull(this.b), $$0);
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
