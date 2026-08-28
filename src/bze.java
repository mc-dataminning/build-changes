import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bze {
   public static bvh<btn> a() {
      return byt.a(
         (Function<byt.b<btn>, ? extends App<byt.c<btn>, byw<btn>>>)($$0 -> $$0.group($$0.a(ccr.n), $$0.a(ccr.az), $$0.a(ccr.ay), $$0.c(ccr.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iz> $$7 = $$0.<btn>a($$3).map(bss::dp).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bvj($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
