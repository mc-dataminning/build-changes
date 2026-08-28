import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxe {
   public static bvg<btl> a(bto $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.am().f()), $$1);
   }

   public static bwq<btl> a(bsw<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.am()), $$1);
   }

   public static bwq<btl> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bwq<btl> a(Predicate<btl> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$2x -> $$2x.group($$2x.c(ccq.n), $$2x.b(ccq.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<btl> $$8 = $$2x.<ccs>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bsq)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bvq($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
