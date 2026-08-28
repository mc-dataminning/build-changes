import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class byy {
   public static bwz<bvf> a(float $$0, brt $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bwz<bvf> a(buq<?> $$0, float $$1, brt $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static bwz<bvf> a(float $$0, brt $$1, Predicate<bvf> $$2) {
      float $$3 = $$0 * $$0;
      byy.a $$4 = new byy.a($$1);
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$3x -> $$3x.group($$3x.c(cej.n), $$3x.b(cej.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvf> $$9 = $$3x.<cel>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((buj)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bxj($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final brt a;
      private int b;

      public a(brt $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azg $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
