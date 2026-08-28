import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bzu {
   public static bxv<bwb> a(float $$0, bsp $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bxv<bwb> a(bvm<?> $$0, float $$1, bsp $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static bxv<bwb> a(float $$0, bsp $$1, Predicate<bwb> $$2) {
      float $$3 = $$0 * $$0;
      bzu.a $$4 = new bzu.a($$1);
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$3x -> $$3x.group($$3x.c(cff.n), $$3x.b(cff.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bwb> $$9 = $$3x.<cfh>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bvf)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new byf($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bsp a;
      private int b;

      public a(bsp $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(bam $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
