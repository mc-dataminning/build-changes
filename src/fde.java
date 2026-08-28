import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fde {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fde.a> b;

   public static CompletableFuture<fde.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fde.a> $$0) {
      fde.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fde.a> b() {
      fio $$0 = fib.Q().X();
      return $$0.g() != fio.a.c ? CompletableFuture.completedFuture(new fde.a(fde.b.d)) : CompletableFuture.supplyAsync(() -> {
         fdk $$0x = fdk.a();

         try {
            if ($$0x.g() != fdk.a.a) {
               return new fde.a(fde.b.b);
            } else {
               return !$$0x.f() ? new fde.a(fde.b.c) : new fde.a(fde.b.a);
            }
         } catch (fev var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fde.a(fde.b.d) : new fde.a(var2);
         }
      }, ad.h());
   }

   public static record a(fde.b a, @Nullable fev b) {
      public a(fde.b $$0) {
         this($$0, null);
      }

      public a(fev $$0) {
         this(fde.b.e, $$0);
      }

      @Nullable
      public fpt a(fpt $$0) {
         return (fpt)(switch (this.a) {
            case a -> null;
            case b -> new ffi($$0);
            case c -> new ffs($$0);
            case d -> new ffn(xd.c("mco.error.invalid.session.title"), xd.c("mco.error.invalid.session.message"), $$0);
            case e -> new ffn(Objects.requireNonNull(this.b), $$0);
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
