import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fel {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fel.a> b;

   public static CompletableFuture<fel.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fel.a> $$0) {
      fel.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fel.a> b() {
      fjv $$0 = fji.Q().X();
      return $$0.g() != fjv.a.c ? CompletableFuture.completedFuture(new fel.a(fel.b.d)) : CompletableFuture.supplyAsync(() -> {
         fer $$0x = fer.a();

         try {
            if ($$0x.g() != fer.a.a) {
               return new fel.a(fel.b.b);
            } else {
               return !$$0x.f() ? new fel.a(fel.b.c) : new fel.a(fel.b.a);
            }
         } catch (fgc var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fel.a(fel.b.d) : new fel.a(var2);
         }
      }, ae.h());
   }

   public static record a(fel.b a, @Nullable fgc b) {
      public a(fel.b $$0) {
         this($$0, null);
      }

      public a(fgc $$0) {
         this(fel.b.e, $$0);
      }

      @Nullable
      public fra a(fra $$0) {
         return (fra)(switch (this.a) {
            case a -> null;
            case b -> new fgp($$0);
            case c -> new fgz($$0);
            case d -> new fgu(xi.c("mco.error.invalid.session.title"), xi.c("mco.error.invalid.session.message"), $$0);
            case e -> new fgu(Objects.requireNonNull(this.b), $$0);
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
