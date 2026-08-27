import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpr {
   private static final int a = 1;

   public static bnn<blx> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bnn<blx> a(Function<blv, Float> $$0) {
      return bqz.a(
         (Function<bqz.b<blx>, ? extends App<bqz.c<blx>, brc<blx>>>)($$1 -> $$1.group($$1.a(bux.m), $$1.a(bux.n), $$1.b(bux.o), $$1.a(bux.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     blv $$9 = $$1.b($$4);
                     Optional<buz> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bno.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bnx($$9, true));
                        $$2.a(new bva(new bnx($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
