import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxv {
   public static bxz<bux> a(int $$0) {
      return cab.a(
         (Function<cab.b<bux>, ? extends App<cab.c<bux>, cae<bux>>>)($$1 -> $$1.group($$1.a(cdz.n), $$1.b(cdz.o), $$1.c(cdz.p), $$1.b(cdz.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     buv $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<ceb>b($$5).a($$9)) {
                        $$2.a(new bwz($$9, true));
                        $$7.a(brx.a);
                        $$7.E($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bux $$0) {
      return $$0.b($$1 -> {
         cvt $$2 = $$1.h();
         return $$2 instanceof cwt && $$0.a((cwt)$$2);
      });
   }
}
