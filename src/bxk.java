import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxk {
   private static final int a = 1;

   public static bvg<btn> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bvg<btn> a(Function<btl, Float> $$0) {
      return bys.a(
         (Function<bys.b<btn>, ? extends App<bys.c<btn>, byv<btn>>>)($$1 -> $$1.group($$1.a(ccq.m), $$1.a(ccq.n), $$1.b(ccq.o), $$1.a(ccq.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btl $$9 = $$1.b($$4);
                     Optional<ccs> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bvh.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvq($$9, true));
                        $$2.a(new cct(new bvq($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
