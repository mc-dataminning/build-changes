import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxn {
   private static final int a = 1;

   public static bvj<btr> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bvj<btr> a(Function<btp, Float> $$0) {
      return byv.a(
         (Function<byv.b<btr>, ? extends App<byv.c<btr>, byy<btr>>>)($$1 -> $$1.group($$1.a(cct.m), $$1.a(cct.n), $$1.b(cct.o), $$1.a(cct.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btp $$9 = $$1.b($$4);
                     Optional<ccv> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bvk.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvt($$9, true));
                        $$2.a(new ccw(new bvt($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
