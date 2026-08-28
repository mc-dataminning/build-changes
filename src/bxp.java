import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxp {
   private static final int a = 1;

   public static bvl<btt> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bvl<btt> a(Function<btr, Float> $$0) {
      return byx.a(
         (Function<byx.b<btt>, ? extends App<byx.c<btt>, bza<btt>>>)($$1 -> $$1.group($$1.a(ccv.m), $$1.a(ccv.n), $$1.b(ccv.o), $$1.a(ccv.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btr $$9 = $$1.b($$4);
                     Optional<ccx> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bvm.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvv($$9, true));
                        $$2.a(new ccy(new bvv($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
