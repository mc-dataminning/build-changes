import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bna {
   public static bla<bji> a(biw<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bol.a(
         (Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$2x -> $$2x.group($$2x.a(bsj.n), $$2x.c(bsj.q), $$2x.b(bsj.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bji> $$9 = $$2x.<bsl>b($$5).a($$3xx -> $$3xx.f((bis)$$7) <= (double)$$2 && $$0.equals($$3xx.ag()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bji $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new blk($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
