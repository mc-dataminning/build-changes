import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzn {
   public static bxb<bvh> a(int $$0, BiPredicate<bvh, bvh> $$1) {
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$2 -> $$2.group($$2.b(cel.o), $$2.a(cel.ab), $$2.c(cel.ai), $$2.a(cel.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvh $$10 = $$2.b($$3);
                     if (!$$10.eE()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dv(), (long)$$0);
                        if ($$10.aq() != bus.bR || $$7.O().b(dge.O)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
