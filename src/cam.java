import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cam {
   public static bya<bwg> a(int $$0, BiPredicate<bwg, bwg> $$1) {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$2 -> $$2.group($$2.b(cfk.o), $$2.a(cfk.ab), $$2.c(cfk.ai), $$2.a(cfk.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bwg $$10 = $$2.b($$3);
                     if (!$$10.eF()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dw(), (long)$$0);
                        if ($$10.aq() != bvr.bS || $$7.N().b(dhe.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
