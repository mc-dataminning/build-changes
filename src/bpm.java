import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpm {
   public static bpq<bmq> a(int $$0) {
      return brs.a(
         (Function<brs.b<bmq>, ? extends App<brs.c<bmq>, brv<bmq>>>)($$1 -> $$1.group($$1.a(bvq.n), $$1.b(bvq.o), $$1.c(bvq.p), $$1.b(bvq.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bmo $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bvs>b($$5).a($$9)) {
                        $$2.a(new boq($$9, true));
                        $$7.a(bkb.a);
                        $$7.B($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bmq $$0) {
      return $$0.b($$1 -> {
         cnb $$2 = $$1.d();
         return $$2 instanceof cnw && $$0.a((cnw)$$2);
      });
   }
}
