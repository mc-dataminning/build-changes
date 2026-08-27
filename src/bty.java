import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bty {
   public static bqb<boi> a() {
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$0 -> $$0.group($$0.a(bxl.n), $$0.a(bxl.az), $$0.a(bxl.ay), $$0.c(bxl.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<hz> $$7 = $$0.<boi>a($$3).map(bnq::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bqd($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
