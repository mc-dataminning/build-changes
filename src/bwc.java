import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwc {
   public static bwg<bte> a(int $$0) {
      return byi.a(
         (Function<byi.b<bte>, ? extends App<byi.c<bte>, byl<bte>>>)($$1 -> $$1.group($$1.a(ccg.n), $$1.b(ccg.o), $$1.c(ccg.p), $$1.b(ccg.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btc $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cci>b($$5).a($$9)) {
                        $$2.a(new bvg($$9, true));
                        $$7.a(bqg.a);
                        $$7.D($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bte $$0) {
      return $$0.b($$1 -> {
         cty $$2 = $$1.g();
         return $$2 instanceof cuw && $$0.a((cuw)$$2);
      });
   }
}
