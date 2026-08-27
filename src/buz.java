import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class buz {
   public static bvd<bsc> a(int $$0) {
      return bxf.a(
         (Function<bxf.b<bsc>, ? extends App<bxf.c<bsc>, bxi<bsc>>>)($$1 -> $$1.group($$1.a(cbd.n), $$1.b(cbd.o), $$1.c(cbd.p), $$1.b(cbd.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bsa $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cbf>b($$5).a($$9)) {
                        $$2.a(new bud($$9, true));
                        $$7.a(bpl.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bsc $$0) {
      return $$0.b($$1 -> {
         csu $$2 = $$1.f();
         return $$2 instanceof ctq && $$0.a((ctq)$$2);
      });
   }
}
