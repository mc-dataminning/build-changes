import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmt {
   public static bkt<bjb> a(bip<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$2x -> $$2x.group($$2x.a(bsc.n), $$2x.c(bsc.q), $$2x.b(bsc.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bjb> $$9 = $$2x.<bse>b($$5).a($$3xx -> $$3xx.f((bil)$$7) <= (double)$$2 && $$0.equals($$3xx.ag()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bjb $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bld($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
