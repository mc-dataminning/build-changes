import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsa {
   public static bod<bml> a() {
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$0 -> $$0.group($$0.a(bvn.n), $$0.a(bvn.ay), $$0.a(bvn.ax), $$0.c(bvn.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<hx> $$7 = $$0.<bml>a($$3).map(blv::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bof($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
