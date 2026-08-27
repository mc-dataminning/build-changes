import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqh {
   private static final int a = 1;

   public static bod<bmn> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bod<bmn> a(Function<bml, Float> $$0) {
      return brp.a(
         (Function<brp.b<bmn>, ? extends App<brp.c<bmn>, brs<bmn>>>)($$1 -> $$1.group($$1.a(bvn.m), $$1.a(bvn.n), $$1.b(bvn.o), $$1.a(bvn.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bml $$9 = $$1.b($$4);
                     Optional<bvp> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && boe.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bon($$9, true));
                        $$2.a(new bvq(new bon($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
