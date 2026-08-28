import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbo {
   public static bxr<bvx> a() {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$0 -> $$0.group($$0.a(cfb.n), $$0.a(cfb.az), $$0.a(cfb.ay), $$0.c(cfb.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<jh> $$7 = $$0.<bvx>a($$3).map(bvb::dw).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bxt($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
