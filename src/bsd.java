import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsd {
   public static bog<bmo> a() {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$0 -> $$0.group($$0.a(bvq.n), $$0.a(bvq.az), $$0.a(bvq.ay), $$0.c(bvq.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<hx> $$7 = $$0.<bmo>a($$3).map(blw::dl).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new boi($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
