import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzf {
   private static final int a = 1;

   public static bxb<bvj> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bxb<bvj> a(Function<bvh, Float> $$0) {
      return can.a(
         (Function<can.b<bvj>, ? extends App<can.c<bvj>, caq<bvj>>>)($$1 -> $$1.group($$1.a(cel.m), $$1.a(cel.n), $$1.b(cel.o), $$1.a(cel.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bvh $$9 = $$1.b($$4);
                     Optional<cen> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bxc.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bxl($$9, true));
                        $$2.a(new ceo(new bxl($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
