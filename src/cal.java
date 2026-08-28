import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cal {
   public static bxz<bwf> a(int $$0, BiPredicate<bwf, bwf> $$1) {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$2 -> $$2.group($$2.b(cfj.o), $$2.a(cfj.ab), $$2.c(cfj.ai), $$2.a(cfj.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bwf $$10 = $$2.b($$3);
                     if (!$$10.eE()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.aq() != bvq.bS || $$7.N().b(dhd.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
