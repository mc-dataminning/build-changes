import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxh {
   public static bvj<btp> a(bts $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bwt<btp> a(bta<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bwt<btp> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bwt<btp> a(Predicate<btp> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$2x -> $$2x.group($$2x.c(cct.n), $$2x.b(cct.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<btp> $$8 = $$2x.<ccv>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bsu)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvt($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
