import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class buo {
   public static bwc<brx> a(bpo $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bwc<brx> a(bpo $$0, Function<bsy, Float> $$1) {
      return bye.a(
         (Function<bye.b<brx>, ? extends App<bye.c<brx>, byh<brx>>>)($$2 -> $$2.group($$2.b(ccc.K), $$2.a(ccc.n), $$2.c(ccc.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        brx $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           ccf $$10 = new ccf(new bvc($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bvc($$9, true));
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
