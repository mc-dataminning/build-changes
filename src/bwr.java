import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwr {
   public static bwv<btt> a(int $$0) {
      return byx.a(
         (Function<byx.b<btt>, ? extends App<byx.c<btt>, bza<btt>>>)($$1 -> $$1.group($$1.a(ccv.n), $$1.b(ccv.o), $$1.c(ccv.p), $$1.b(ccv.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btr $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<ccx>b($$5).a($$9)) {
                        $$2.a(new bvv($$9, true));
                        $$7.a(bqv.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(btt $$0) {
      return $$0.b($$1 -> {
         cum $$2 = $$1.g();
         return $$2 instanceof cvk && $$0.a((cvk)$$2);
      });
   }
}
