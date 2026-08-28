import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzb {
   public static bve<btk> a() {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$0 -> $$0.group($$0.a(cco.n), $$0.a(cco.az), $$0.a(cco.ay), $$0.c(cco.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iz> $$7 = $$0.<btk>a($$3).map(bsp::dp).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bvg($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
