import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwz {
   private static final int a = 1;

   public static buv<btd> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static buv<btd> a(Function<btb, Float> $$0) {
      return byh.a(
         (Function<byh.b<btd>, ? extends App<byh.c<btd>, byk<btd>>>)($$1 -> $$1.group($$1.a(ccf.m), $$1.a(ccf.n), $$1.b(ccf.o), $$1.a(ccf.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btb $$9 = $$1.b($$4);
                     Optional<cch> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && buw.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvf($$9, true));
                        $$2.a(new cci(new bvf($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
