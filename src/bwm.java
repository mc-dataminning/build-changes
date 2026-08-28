import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwm {
   public static bwq<btn> a(int $$0) {
      return bys.a(
         (Function<bys.b<btn>, ? extends App<bys.c<btn>, byv<btn>>>)($$1 -> $$1.group($$1.a(ccq.n), $$1.b(ccq.o), $$1.c(ccq.p), $$1.b(ccq.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btl $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<ccs>b($$5).a($$9)) {
                        $$2.a(new bvq($$9, true));
                        $$7.a(bqp.a);
                        $$7.D($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(btn $$0) {
      return $$0.b($$1 -> {
         cuj $$2 = $$1.g();
         return $$2 instanceof cvl && $$0.a((cvl)$$2);
      });
   }
}
