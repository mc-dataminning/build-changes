import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class faw {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<faw.a> b;

   public static CompletableFuture<faw.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<faw.a> $$0) {
      faw.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<faw.a> b() {
      fgh $$0 = fft.Q().X();
      return $$0.g() != fgh.a.c ? CompletableFuture.completedFuture(new faw.a(faw.b.d)) : CompletableFuture.supplyAsync(() -> {
         fbc $$0x = fbc.a();

         try {
            if ($$0x.g() != fbc.a.a) {
               return new faw.a(faw.b.b);
            } else {
               return !$$0x.f() ? new faw.a(faw.b.c) : new faw.a(faw.b.a);
            }
         } catch (fcp var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new faw.a(faw.b.d) : new faw.a(var2);
         }
      }, ac.h());
   }

   public static record a(faw.b a, @Nullable fcp b) {
      public a(faw.b $$0) {
         this($$0, null);
      }

      public a(fcp $$0) {
         this(faw.b.e, $$0);
      }

      @Nullable
      public fnj a(fnj $$0) {
         return (fnj)(switch (this.a) {
            case a -> null;
            case b -> new fdc($$0);
            case c -> new fdm($$0);
            case d -> new fdh(wu.c("mco.error.invalid.session.title"), wu.c("mco.error.invalid.session.message"), $$0);
            case e -> new fdh(Objects.requireNonNull(this.b), $$0);
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
