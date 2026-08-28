import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flk {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<flk.a> b;

   public static CompletableFuture<flk.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<flk.a> $$0) {
      flk.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<flk.a> b() {
      frc $$0 = fqq.Q().X();
      return $$0.g() != frc.a.c ? CompletableFuture.completedFuture(new flk.a(flk.b.d)) : CompletableFuture.supplyAsync(() -> {
         flq $$0x = flq.a();

         try {
            if ($$0x.h() != flq.a.a) {
               return new flk.a(flk.b.b);
            } else {
               return !$$0x.g() ? new flk.a(flk.b.c) : new flk.a(flk.b.a);
            }
         } catch (fnm var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new flk.a(flk.b.d) : new flk.a(var2);
         }
      }, ag.i());
   }

   public static record a(flk.b a, @Nullable fnm b) {
      public a(flk.b $$0) {
         this($$0, null);
      }

      public a(fnm $$0) {
         this(flk.b.e, $$0);
      }

      @Nullable
      public fzq a(fzq $$0) {
         return (fzq)(switch (this.a) {
            case a -> null;
            case b -> new fnz($$0);
            case c -> new foj($$0);
            case d -> new foe(xg.c("mco.error.invalid.session.title"), xg.c("mco.error.invalid.session.message"), $$0);
            case e -> new foe(Objects.requireNonNull(this.b), $$0);
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
