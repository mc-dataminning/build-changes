import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cad {
   public static bxr<bvx> a(int $$0, BiPredicate<bvx, bvx> $$1) {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$2 -> $$2.group($$2.b(cfb.o), $$2.a(cfb.ab), $$2.c(cfb.ai), $$2.a(cfb.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvx $$10 = $$2.b($$3);
                     if (!$$10.eF()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dw(), (long)$$0);
                        if ($$10.aq() != bvi.bS || $$7.O().b(dgv.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
