import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bxk {
   public static bvl<btr> a(float $$0, bqh $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bvl<btr> a(btc<?> $$0, float $$1, bqh $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ak()));
   }

   private static bvl<btr> a(float $$0, bqh $$1, Predicate<btr> $$2) {
      float $$3 = $$0 * $$0;
      bxk.a $$4 = new bxk.a($$1);
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$3x -> $$3x.group($$3x.c(ccv.n), $$3x.b(ccv.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btr> $$9 = $$3x.<ccx>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bsw)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bvv($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bqh a;
      private int b;

      public a(bqh $$0) {
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
