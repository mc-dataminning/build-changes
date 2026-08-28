import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxo {
   private static final int a = 1;

   public static bvk<bts> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bvk<bts> a(Function<btq, Float> $$0) {
      return byw.a(
         (Function<byw.b<bts>, ? extends App<byw.c<bts>, byz<bts>>>)($$1 -> $$1.group($$1.a(ccu.m), $$1.a(ccu.n), $$1.b(ccu.o), $$1.a(ccu.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btq $$9 = $$1.b($$4);
                     Optional<ccw> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bvl.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvu($$9, true));
                        $$2.a(new ccx(new bvu($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
