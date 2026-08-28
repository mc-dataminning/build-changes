import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bza {
   public static bxb<bvh> a(float $$0, brv $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bxb<bvh> a(bus<?> $$0, float $$1, brv $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static bxb<bvh> a(float $$0, brv $$1, Predicate<bvh> $$2) {
      float $$3 = $$0 * $$0;
      bza.a $$4 = new bza.a($$1);
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$3x -> $$3x.group($$3x.c(cel.n), $$3x.b(cel.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvh> $$9 = $$3x.<cen>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bul)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bxl($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final brv a;
      private int b;

      public a(brv $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azh $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
