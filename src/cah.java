import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cah {
   public static bxv<bwb> a(int $$0, BiPredicate<bwb, bwb> $$1) {
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$2 -> $$2.group($$2.b(cff.o), $$2.a(cff.ab), $$2.c(cff.ai), $$2.a(cff.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bwb $$10 = $$2.b($$3);
                     if (!$$10.eE()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.aq() != bvm.bS || $$7.N().b(dgw.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
