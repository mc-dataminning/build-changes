import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class feu {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<feu.a> b;

   public static CompletableFuture<feu.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<feu.a> $$0) {
      feu.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<feu.a> b() {
      fkk $$0 = fjx.Q().X();
      return $$0.g() != fkk.a.c ? CompletableFuture.completedFuture(new feu.a(feu.b.d)) : CompletableFuture.supplyAsync(() -> {
         ffa $$0x = ffa.a();

         try {
            if ($$0x.g() != ffa.a.a) {
               return new feu.a(feu.b.b);
            } else {
               return !$$0x.f() ? new feu.a(feu.b.c) : new feu.a(feu.b.a);
            }
         } catch (fgv var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new feu.a(feu.b.d) : new feu.a(var2);
         }
      }, ae.h());
   }

   public static record a(feu.b a, @Nullable fgv b) {
      public a(feu.b $$0) {
         this($$0, null);
      }

      public a(fgv $$0) {
         this(feu.b.e, $$0);
      }

      @Nullable
      public frp a(frp $$0) {
         return (frp)(switch (this.a) {
            case a -> null;
            case b -> new fhi($$0);
            case c -> new fhs($$0);
            case d -> new fhn(xl.c("mco.error.invalid.session.title"), xl.c("mco.error.invalid.session.message"), $$0);
            case e -> new fhn(Objects.requireNonNull(this.b), $$0);
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
