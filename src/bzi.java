import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzi {
   public static caw<bwj> a(buc $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static caw<bwj> a(buc $$0, Function<bxu, Float> $$1) {
      return ccy.a(
         (Function<ccy.b<bwj>, ? extends App<ccy.c<bwj>, cdb<bwj>>>)($$2 -> $$2.group($$2.b(cgw.L), $$2.a(cgw.o), $$2.c(cgw.n))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bwj $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cgz $$10 = new cgz(new bzw($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bzw($$9, true));
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
