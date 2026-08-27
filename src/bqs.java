import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bqs {
   public static bog<bmo> a(int $$0, BiPredicate<bmo, bmo> $$1) {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$2 -> $$2.group($$2.b(bvq.o), $$2.a(bvq.ab), $$2.c(bvq.ai), $$2.a(bvq.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bmo $$10 = $$2.b($$3);
                     if (!$$10.ew()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dl(), (long)$$0);
                        if ($$10.ai() != bmc.bw || $$7.Z().b(ctt.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
