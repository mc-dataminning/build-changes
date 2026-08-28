import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzz {
   private static final int a = 1;

   public static bxv<bwd> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bxv<bwd> a(Function<bwb, Float> $$0) {
      return cbh.a(
         (Function<cbh.b<bwd>, ? extends App<cbh.c<bwd>, cbk<bwd>>>)($$1 -> $$1.group($$1.a(cff.m), $$1.a(cff.n), $$1.b(cff.o), $$1.a(cff.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bwb $$9 = $$1.b($$4);
                     Optional<cfh> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bxw.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new byf($$9, true));
                        $$2.a(new cfi(new byf($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
