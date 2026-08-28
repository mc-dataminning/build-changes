import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzi {
   public static bvl<btr> a() {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$0 -> $$0.group($$0.a(ccv.n), $$0.a(ccv.az), $$0.a(ccv.ay), $$0.c(ccv.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iz> $$7 = $$0.<btr>a($$3).map(bsw::dp).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bvn($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
