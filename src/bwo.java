import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwo {
   public static bws<btq> a(int $$0) {
      return byu.a(
         (Function<byu.b<btq>, ? extends App<byu.c<btq>, byx<btq>>>)($$1 -> $$1.group($$1.a(ccs.n), $$1.b(ccs.o), $$1.c(ccs.p), $$1.b(ccs.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bto $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<ccu>b($$5).a($$9)) {
                        $$2.a(new bvs($$9, true));
                        $$7.a(bqs.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(btq $$0) {
      return $$0.b($$1 -> {
         cuj $$2 = $$1.g();
         return $$2 instanceof cvh && $$0.a((cvh)$$2);
      });
   }
}
