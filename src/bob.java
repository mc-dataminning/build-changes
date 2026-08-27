import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bob {
   public static bmb<bkj> a(bjx<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$2x -> $$2x.group($$2x.a(btk.n), $$2x.c(btk.q), $$2x.b(btk.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bkj> $$9 = $$2x.<btm>b($$5).a($$3xx -> $$3xx.f((bjt)$$7) <= (double)$$2 && $$0.equals($$3xx.ag()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bkj $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bml($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
