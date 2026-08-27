import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bpm {
   public static bnn<blv> a(float $$0, biw $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bnn<blv> a(blj<?> $$0, float $$1, biw $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bnn<blv> a(float $$0, biw $$1, Predicate<blv> $$2) {
      float $$3 = $$0 * $$0;
      bpm.a $$4 = new bpm.a($$1);
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$3x -> $$3x.group($$3x.c(bux.n), $$3x.b(bux.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<blv> $$9 = $$3x.<buz>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((blf)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bnx($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final biw a;
      private int b;

      public a(biw $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(auf $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
