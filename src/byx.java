import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byx {
   public static cal<bvy> a(btr $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static cal<bvy> a(btr $$0, Function<bxj, Float> $$1) {
      return ccn.a(
         (Function<ccn.b<bvy>, ? extends App<ccn.c<bvy>, ccq<bvy>>>)($$2 -> $$2.group($$2.b(cgl.L), $$2.a(cgl.o), $$2.c(cgl.n))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bvy $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cgo $$10 = new cgo(new bzl($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bzl($$9, true));
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
