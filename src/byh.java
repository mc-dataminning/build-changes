import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byh {
   public static buk<bsq> a() {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$0 -> $$0.group($$0.a(cbu.n), $$0.a(cbu.az), $$0.a(cbu.ay), $$0.c(cbu.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<io> $$7 = $$0.<bsq>a($$3).map(brw::dp).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bum($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
