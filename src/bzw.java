import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzw {
   private static final int a = 1;

   public static bxs<bwa> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bxs<bwa> a(Function<bvy, Float> $$0) {
      return cbe.a(
         (Function<cbe.b<bwa>, ? extends App<cbe.c<bwa>, cbh<bwa>>>)($$1 -> $$1.group($$1.a(cfc.m), $$1.a(cfc.n), $$1.b(cfc.o), $$1.a(cfc.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bvy $$9 = $$1.b($$4);
                     Optional<cfe> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bxt.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new byc($$9, true));
                        $$2.a(new cff(new byc($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
