import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cbg {
   public static byu<bxc> a(int $$0, BiPredicate<bxc, bxc> $$1) {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$2 -> $$2.group($$2.b(cge.p), $$2.a(cge.ac), $$2.c(cge.aj), $$2.a(cge.ak))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bxc $$10 = $$2.b($$3);
                     if (!$$10.eG()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.aq() != bwm.bS || $$7.O().c(dir.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
