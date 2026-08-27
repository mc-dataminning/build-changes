import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmj {
   public static bmn<bjo> a(int $$0) {
      return bop.a(
         (Function<bop.b<bjo>, ? extends App<bop.c<bjo>, bos<bjo>>>)($$1 -> $$1.group($$1.a(bsn.n), $$1.b(bsn.o), $$1.c(bsn.p), $$1.b(bsn.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bjm $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bsp>b($$5).a($$9)) {
                        $$2.a(new blo($$9, true));
                        $$7.a(bhd.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bjo $$0) {
      return $$0.b($$1 -> {
         cjg $$2 = $$1.d();
         return $$2 instanceof ckb && $$0.a((ckb)$$2);
      });
   }
}
