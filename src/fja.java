import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fja {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fja.a> b;

   public static CompletableFuture<fja.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fja.a> $$0) {
      fja.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fja.a> b() {
      fos $$0 = fof.Q().X();
      return $$0.g() != fos.a.c ? CompletableFuture.completedFuture(new fja.a(fja.b.d)) : CompletableFuture.supplyAsync(() -> {
         fjg $$0x = fjg.a();

         try {
            if ($$0x.g() != fjg.a.a) {
               return new fja.a(fja.b.b);
            } else {
               return !$$0x.f() ? new fja.a(fja.b.c) : new fja.a(fja.b.a);
            }
         } catch (flc var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fja.a(fja.b.d) : new fja.a(var2);
         }
      }, af.i());
   }

   public static record a(fja.b a, @Nullable flc b) {
      public a(fja.b $$0) {
         this($$0, null);
      }

      public a(flc $$0) {
         this(fja.b.e, $$0);
      }

      @Nullable
      public fxi a(fxi $$0) {
         return (fxi)(switch (this.a) {
            case a -> null;
            case b -> new flp($$0);
            case c -> new flz($$0);
            case d -> new flu(ww.c("mco.error.invalid.session.title"), ww.c("mco.error.invalid.session.message"), $$0);
            case e -> new flu(Objects.requireNonNull(this.b), $$0);
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
