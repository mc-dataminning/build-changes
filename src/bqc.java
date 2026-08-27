import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bqc {
   public static bod<bml> a(float $$0, bjm $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bod<bml> a(blz<?> $$0, float $$1, bjm $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bod<bml> a(float $$0, bjm $$1, Predicate<bml> $$2) {
      float $$3 = $$0 * $$0;
      bqc.a $$4 = new bqc.a($$1);
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$3x -> $$3x.group($$3x.c(bvn.n), $$3x.b(bvn.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bml> $$9 = $$3x.<bvp>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((blv)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bon($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bjm a;
      private int b;

      public a(bjm $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(auv $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
