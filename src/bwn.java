import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwn {
   public static bwr<btp> a(int $$0) {
      return byt.a(
         (Function<byt.b<btp>, ? extends App<byt.c<btp>, byw<btp>>>)($$1 -> $$1.group($$1.a(ccr.n), $$1.b(ccr.o), $$1.c(ccr.p), $$1.b(ccr.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btn $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cct>b($$5).a($$9)) {
                        $$2.a(new bvr($$9, true));
                        $$7.a(bqr.a);
                        $$7.C($$9);
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
         cui $$2 = $$1.g();
         return $$2 instanceof cvg && $$0.a((cvg)$$2);
      });
   }
}
