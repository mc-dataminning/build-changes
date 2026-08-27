import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bop {
   public static bkt<bjb> a() {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$0 -> $$0.group($$0.a(bsc.n), $$0.a(bsc.ay), $$0.a(bsc.ax), $$0.c(bsc.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<gw> $$7 = $$0.<bjb>a($$3).map(bil::dk).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bkv($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
