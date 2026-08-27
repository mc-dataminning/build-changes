import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnh {
   private static final int a = 1;

   public static ble<bjo> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static ble<bjo> a(Function<bjm, Float> $$0) {
      return bop.a(
         (Function<bop.b<bjo>, ? extends App<bop.c<bjo>, bos<bjo>>>)($$1 -> $$1.group($$1.a(bsn.m), $$1.a(bsn.n), $$1.b(bsn.o), $$1.a(bsn.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bjm $$9 = $$1.b($$4);
                     Optional<bsp> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && blf.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new blo($$9, true));
                        $$2.a(new bsq(new blo($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
