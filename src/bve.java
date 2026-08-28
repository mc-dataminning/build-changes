import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bve {
   public static bws<bsl> a(bqc $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bws<bsl> a(bqc $$0, Function<btn, Float> $$1) {
      return byu.a(
         (Function<byu.b<bsl>, ? extends App<byu.c<bsl>, byx<bsl>>>)($$2 -> $$2.group($$2.b(ccs.K), $$2.a(ccs.n), $$2.c(ccs.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bsl $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           ccv $$10 = new ccv(new bvs($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bvs($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
