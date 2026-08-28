import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzh {
   public static bvk<btq> a() {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$0 -> $$0.group($$0.a(ccu.n), $$0.a(ccu.az), $$0.a(ccu.ay), $$0.c(ccu.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iz> $$7 = $$0.<btq>a($$3).map(bsv::dp).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bvm($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
