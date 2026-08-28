import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fay {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fay.a> b;

   public static CompletableFuture<fay.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fay.a> $$0) {
      fay.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fay.a> b() {
      fgj $$0 = ffw.Q().X();
      return $$0.g() != fgj.a.c ? CompletableFuture.completedFuture(new fay.a(fay.b.d)) : CompletableFuture.supplyAsync(() -> {
         fbe $$0x = fbe.a();

         try {
            if ($$0x.g() != fbe.a.a) {
               return new fay.a(fay.b.b);
            } else {
               return !$$0x.f() ? new fay.a(fay.b.c) : new fay.a(fay.b.a);
            }
         } catch (fcr var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fay.a(fay.b.d) : new fay.a(var2);
         }
      }, ac.h());
   }

   public static record a(fay.b a, @Nullable fcr b) {
      public a(fay.b $$0) {
         this($$0, null);
      }

      public a(fcr $$0) {
         this(fay.b.e, $$0);
      }

      @Nullable
      public fnl a(fnl $$0) {
         return (fnl)(switch (this.a) {
            case a -> null;
            case b -> new fde($$0);
            case c -> new fdo($$0);
            case d -> new fdj(wu.c("mco.error.invalid.session.title"), wu.c("mco.error.invalid.session.message"), $$0);
            case e -> new fdj(Objects.requireNonNull(this.b), $$0);
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
