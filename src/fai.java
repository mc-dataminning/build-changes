import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fai {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fai.a> b;

   public static CompletableFuture<fai.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fai.a> $$0) {
      fai.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fai.a> b() {
      fft $$0 = fff.Q().X();
      return $$0.g() != fft.a.c ? CompletableFuture.completedFuture(new fai.a(fai.b.d)) : CompletableFuture.supplyAsync(() -> {
         fao $$0x = fao.a();

         try {
            if ($$0x.g() != fao.a.a) {
               return new fai.a(fai.b.b);
            } else {
               return !$$0x.f() ? new fai.a(fai.b.c) : new fai.a(fai.b.a);
            }
         } catch (fcb var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fai.a(fai.b.d) : new fai.a(var2);
         }
      }, ac.h());
   }

   public static record a(fai.b a, @Nullable fcb b) {
      public a(fai.b $$0) {
         this($$0, null);
      }

      public a(fcb $$0) {
         this(fai.b.e, $$0);
      }

      @Nullable
      public fnd a(fnd $$0) {
         return (fnd)(switch (this.a) {
            case a -> null;
            case b -> new fcn($$0);
            case c -> new fcy($$0);
            case d -> new fcs(xp.c("mco.error.invalid.session.title"), xp.c("mco.error.invalid.session.message"), $$0);
            case e -> new fcs(Objects.requireNonNull(this.b), $$0);
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
