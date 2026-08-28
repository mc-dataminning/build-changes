import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzm {
   public static bxa<bvg> a(int $$0, BiPredicate<bvg, bvg> $$1) {
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$2 -> $$2.group($$2.b(cek.o), $$2.a(cek.ab), $$2.c(cek.ai), $$2.a(cek.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvg $$10 = $$2.b($$3);
                     if (!$$10.eE()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.aq() != bur.bR || $$7.O().b(dgd.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
