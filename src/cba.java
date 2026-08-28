import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cba {
   private static final int a = 1;

   public static byw<bxg> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static byw<bxg> a(Function<bxe, Float> $$0) {
      return cci.a(
         (Function<cci.b<bxg>, ? extends App<cci.c<bxg>, ccl<bxg>>>)($$1 -> $$1.group($$1.a(cgg.n), $$1.a(cgg.o), $$1.b(cgg.p), $$1.a(cgg.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bxe $$9 = $$1.b($$4);
                     Optional<cgi> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && byx.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bzg($$9, true));
                        $$2.a(new cgj(new bzg($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
