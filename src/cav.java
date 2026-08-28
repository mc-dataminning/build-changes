import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cav {
   public static byu<bxc> a(bwm<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$2x -> $$2x.group($$2x.a(cge.o), $$2x.c(cge.r), $$2x.b(cge.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bxc> $$9 = $$2x.<cgg>b($$5).a($$3xx -> $$3xx.g($$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bxc $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bze($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
