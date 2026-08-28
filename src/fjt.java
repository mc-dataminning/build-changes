import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjt {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fjt.a> b;

   public static CompletableFuture<fjt.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fjt.a> $$0) {
      fjt.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fjt.a> b() {
      fpl $$0 = foz.Q().X();
      return $$0.g() != fpl.a.c ? CompletableFuture.completedFuture(new fjt.a(fjt.b.d)) : CompletableFuture.supplyAsync(() -> {
         fjz $$0x = fjz.a();

         try {
            if ($$0x.g() != fjz.a.a) {
               return new fjt.a(fjt.b.b);
            } else {
               return !$$0x.f() ? new fjt.a(fjt.b.c) : new fjt.a(fjt.b.a);
            }
         } catch (flv var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fjt.a(fjt.b.d) : new fjt.a(var2);
         }
      }, af.i());
   }

   public static record a(fjt.b a, @Nullable flv b) {
      public a(fjt.b $$0) {
         this($$0, null);
      }

      public a(flv $$0) {
         this(fjt.b.e, $$0);
      }

      @Nullable
      public fyb a(fyb $$0) {
         return (fyb)(switch (this.a) {
            case a -> null;
            case b -> new fmi($$0);
            case c -> new fms($$0);
            case d -> new fmn(wy.c("mco.error.invalid.session.title"), wy.c("mco.error.invalid.session.message"), $$0);
            case e -> new fmn(Objects.requireNonNull(this.b), $$0);
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
