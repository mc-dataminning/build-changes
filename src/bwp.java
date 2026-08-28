import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwp {
   public static bwt<btr> a(int $$0) {
      return byv.a(
         (Function<byv.b<btr>, ? extends App<byv.c<btr>, byy<btr>>>)($$1 -> $$1.group($$1.a(cct.n), $$1.b(cct.o), $$1.c(cct.p), $$1.b(cct.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btp $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<ccv>b($$5).a($$9)) {
                        $$2.a(new bvt($$9, true));
                        $$7.a(bqt.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(btr $$0) {
      return $$0.b($$1 -> {
         cuk $$2 = $$1.g();
         return $$2 instanceof cvi && $$0.a((cvi)$$2);
      });
   }
}
