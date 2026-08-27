import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvo {
   public static bvs<bsq> a(int $$0) {
      return bxu.a(
         (Function<bxu.b<bsq>, ? extends App<bxu.c<bsq>, bxx<bsq>>>)($$1 -> $$1.group($$1.a(cbs.n), $$1.b(cbs.o), $$1.c(cbs.p), $$1.b(cbs.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bso $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cbu>b($$5).a($$9)) {
                        $$2.a(new bus($$9, true));
                        $$7.a(bpt.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bsq $$0) {
      return $$0.b($$1 -> {
         ctj $$2 = $$1.g();
         return $$2 instanceof cuh && $$0.a((cuh)$$2);
      });
   }
}
