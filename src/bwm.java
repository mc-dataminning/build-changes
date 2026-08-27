import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwm {
   private static final int a = 1;

   public static bui<bsq> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bui<bsq> a(Function<bso, Float> $$0) {
      return bxu.a(
         (Function<bxu.b<bsq>, ? extends App<bxu.c<bsq>, bxx<bsq>>>)($$1 -> $$1.group($$1.a(cbs.m), $$1.a(cbs.n), $$1.b(cbs.o), $$1.a(cbs.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bso $$9 = $$1.b($$4);
                     Optional<cbu> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && buj.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bus($$9, true));
                        $$2.a(new cbv(new bus($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
