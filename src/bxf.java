import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxf {
   public static bve<btk> a(bsv<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$2x -> $$2x.group($$2x.a(cco.n), $$2x.c(cco.q), $$2x.b(cco.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btk> $$9 = $$2x.<ccq>b($$5).a($$3xx -> $$3xx.g((bsp)$$7) <= (double)$$2 && $$0.equals($$3xx.ak()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        btk $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bvo($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
