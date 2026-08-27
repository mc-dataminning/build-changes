import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqd {
   public static boc<bmk> a(bly<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$2x -> $$2x.group($$2x.a(bvm.n), $$2x.c(bvm.q), $$2x.b(bvm.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bmk> $$9 = $$2x.<bvo>b($$5).a($$3xx -> $$3xx.f((blu)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bmk $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bom($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
