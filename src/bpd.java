import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpd {
   public static bnd<bll> a(bkz<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$2x -> $$2x.group($$2x.a(bum.n), $$2x.c(bum.q), $$2x.b(bum.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bll> $$9 = $$2x.<buo>b($$5).a($$3xx -> $$3xx.f((bkv)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bll $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bnn($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
