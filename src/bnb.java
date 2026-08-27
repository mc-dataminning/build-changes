import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnb {
   private static final int a = 1;

   public static bky<bji> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bky<bji> a(Function<bjg, Float> $$0) {
      return boj.a(
         (Function<boj.b<bji>, ? extends App<boj.c<bji>, bom<bji>>>)($$1 -> $$1.group($$1.a(bsh.m), $$1.a(bsh.n), $$1.b(bsh.o), $$1.a(bsh.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bjg $$9 = $$1.b($$4);
                     Optional<bsj> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bkz.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bli($$9, true));
                        $$2.a(new bsk(new bli($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
