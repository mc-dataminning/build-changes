import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bly {
   public static bmc<bjd> a(int $$0) {
      return boe.a(
         (Function<boe.b<bjd>, ? extends App<boe.c<bjd>, boh<bjd>>>)($$1 -> $$1.group($$1.a(bsc.n), $$1.b(bsc.o), $$1.c(bsc.p), $$1.b(bsc.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bjb $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bse>b($$5).a($$9)) {
                        $$2.a(new bld($$9, true));
                        $$7.a(bgs.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bjd $$0) {
      return $$0.b($$1 -> {
         civ $$2 = $$1.d();
         return $$2 instanceof cjq && $$0.a((cjq)$$2);
      });
   }
}
