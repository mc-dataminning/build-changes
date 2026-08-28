import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwb {
   public static bwf<btd> a(int $$0) {
      return byh.a(
         (Function<byh.b<btd>, ? extends App<byh.c<btd>, byk<btd>>>)($$1 -> $$1.group($$1.a(ccf.n), $$1.b(ccf.o), $$1.c(ccf.p), $$1.b(ccf.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btb $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cch>b($$5).a($$9)) {
                        $$2.a(new bvf($$9, true));
                        $$7.a(bqf.a);
                        $$7.D($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(btd $$0) {
      return $$0.b($$1 -> {
         ctx $$2 = $$1.g();
         return $$2 instanceof cuv && $$0.a((cuv)$$2);
      });
   }
}
