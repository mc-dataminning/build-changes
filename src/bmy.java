import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmy {
   public static bky<bjg> a(biu<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$2x -> $$2x.group($$2x.a(bsh.n), $$2x.c(bsh.q), $$2x.b(bsh.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bjg> $$9 = $$2x.<bsj>b($$5).a($$3xx -> $$3xx.f((biq)$$7) <= (double)$$2 && $$0.equals($$3xx.ag()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bjg $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bli($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
