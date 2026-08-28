import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjm {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fjm.a> b;

   public static CompletableFuture<fjm.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fjm.a> $$0) {
      fjm.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fjm.a> b() {
      fpe $$0 = fos.Q().X();
      return $$0.g() != fpe.a.c ? CompletableFuture.completedFuture(new fjm.a(fjm.b.d)) : CompletableFuture.supplyAsync(() -> {
         fjs $$0x = fjs.a();

         try {
            if ($$0x.g() != fjs.a.a) {
               return new fjm.a(fjm.b.b);
            } else {
               return !$$0x.f() ? new fjm.a(fjm.b.c) : new fjm.a(fjm.b.a);
            }
         } catch (flo var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fjm.a(fjm.b.d) : new fjm.a(var2);
         }
      }, af.i());
   }

   public static record a(fjm.b a, @Nullable flo b) {
      public a(fjm.b $$0) {
         this($$0, null);
      }

      public a(flo $$0) {
         this(fjm.b.e, $$0);
      }

      @Nullable
      public fxu a(fxu $$0) {
         return (fxu)(switch (this.a) {
            case a -> null;
            case b -> new fmb($$0);
            case c -> new fml($$0);
            case d -> new fmg(wy.c("mco.error.invalid.session.title"), wy.c("mco.error.invalid.session.message"), $$0);
            case e -> new fmg(Objects.requireNonNull(this.b), $$0);
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
