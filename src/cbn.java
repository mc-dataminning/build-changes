import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cbn {
   public static bzb<bxj> a(int $$0, BiPredicate<bxj, bxj> $$1) {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$2 -> $$2.group($$2.b(cgl.p), $$2.a(cgl.ac), $$2.c(cgl.aj), $$2.a(cgl.ak))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bxj $$10 = $$2.b($$3);
                     if (!$$10.eG()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.du(), (long)$$0);
                        if ($$10.an() != bwr.bS || $$7.O().c(djd.P)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
