import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxa {
   private static final int a = 1;

   public static buw<bte> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static buw<bte> a(Function<btc, Float> $$0) {
      return byi.a(
         (Function<byi.b<bte>, ? extends App<byi.c<bte>, byl<bte>>>)($$1 -> $$1.group($$1.a(ccg.m), $$1.a(ccg.n), $$1.b(ccg.o), $$1.a(ccg.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btc $$9 = $$1.b($$4);
                     Optional<cci> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bux.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvg($$9, true));
                        $$2.a(new ccj(new bvg($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
