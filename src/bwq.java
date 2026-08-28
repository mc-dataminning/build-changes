import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwq {
   public static bwu<bts> a(int $$0) {
      return byw.a(
         (Function<byw.b<bts>, ? extends App<byw.c<bts>, byz<bts>>>)($$1 -> $$1.group($$1.a(ccu.n), $$1.b(ccu.o), $$1.c(ccu.p), $$1.b(ccu.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btq $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<ccw>b($$5).a($$9)) {
                        $$2.a(new bvu($$9, true));
                        $$7.a(bqu.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bts $$0) {
      return $$0.b($$1 -> {
         cul $$2 = $$1.g();
         return $$2 instanceof cvj && $$0.a((cvj)$$2);
      });
   }
}
