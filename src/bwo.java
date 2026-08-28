import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwo {
   public static bws<btp> a(int $$0) {
      return byu.a(
         (Function<byu.b<btp>, ? extends App<byu.c<btp>, byx<btp>>>)($$1 -> $$1.group($$1.a(ccs.n), $$1.b(ccs.o), $$1.c(ccs.p), $$1.b(ccs.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btn $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<ccu>b($$5).a($$9)) {
                        $$2.a(new bvs($$9, true));
                        $$7.a(bqq.a);
                        $$7.D($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(btp $$0) {
      return $$0.b($$1 -> {
         cul $$2 = $$1.g();
         return $$2 instanceof cvn && $$0.a((cvn)$$2);
      });
   }
}
