import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bot {
   public static box<blx> a(int $$0) {
      return bqz.a(
         (Function<bqz.b<blx>, ? extends App<bqz.c<blx>, brc<blx>>>)($$1 -> $$1.group($$1.a(bux.n), $$1.b(bux.o), $$1.c(bux.p), $$1.b(bux.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     blv $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<buz>b($$5).a($$9)) {
                        $$2.a(new bnx($$9, true));
                        $$7.a(bjk.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(blx $$0) {
      return $$0.b($$1 -> {
         cmc $$2 = $$1.d();
         return $$2 instanceof cmx && $$0.a((cmx)$$2);
      });
   }
}
