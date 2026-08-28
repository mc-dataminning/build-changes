import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bwu {
   public static buv<btb> a(float $$0, bpr $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static buv<btb> a(bsm<?> $$0, float $$1, bpr $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.al()));
   }

   private static buv<btb> a(float $$0, bpr $$1, Predicate<btb> $$2) {
      float $$3 = $$0 * $$0;
      bwu.a $$4 = new bwu.a($$1);
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$3x -> $$3x.group($$3x.c(ccf.n), $$3x.b(ccf.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btb> $$9 = $$3x.<cch>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bsg)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bvf($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bpr a;
      private int b;

      public a(bpr $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ayo $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
