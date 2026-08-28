import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzd {
   private static final int a = 1;

   public static bwz<bvh> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bwz<bvh> a(Function<bvf, Float> $$0) {
      return cal.a(
         (Function<cal.b<bvh>, ? extends App<cal.c<bvh>, cao<bvh>>>)($$1 -> $$1.group($$1.a(cej.m), $$1.a(cej.n), $$1.b(cej.o), $$1.a(cej.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bvf $$9 = $$1.b($$4);
                     Optional<cel> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bxa.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bxj($$9, true));
                        $$2.a(new cem(new bxj($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
