import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhy {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fhy.a> b;

   public static CompletableFuture<fhy.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fhy.a> $$0) {
      fhy.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fhy.a> b() {
      fnp $$0 = fnd.Q().X();
      return $$0.g() != fnp.a.c ? CompletableFuture.completedFuture(new fhy.a(fhy.b.d)) : CompletableFuture.supplyAsync(() -> {
         fie $$0x = fie.a();

         try {
            if ($$0x.g() != fie.a.a) {
               return new fhy.a(fhy.b.b);
            } else {
               return !$$0x.f() ? new fhy.a(fhy.b.c) : new fhy.a(fhy.b.a);
            }
         } catch (fka var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fhy.a(fhy.b.d) : new fhy.a(var2);
         }
      }, af.i());
   }

   public static record a(fhy.b a, @Nullable fka b) {
      public a(fhy.b $$0) {
         this($$0, null);
      }

      public a(fka $$0) {
         this(fhy.b.e, $$0);
      }

      @Nullable
      public fwf a(fwf $$0) {
         return (fwf)(switch (this.a) {
            case a -> null;
            case b -> new fkn($$0);
            case c -> new fkx($$0);
            case d -> new fks(wv.c("mco.error.invalid.session.title"), wv.c("mco.error.invalid.session.message"), $$0);
            case e -> new fks(Objects.requireNonNull(this.b), $$0);
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
