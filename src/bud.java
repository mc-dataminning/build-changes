import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bud {
   public static buh<brg> a(int $$0) {
      return bwj.a(
         (Function<bwj.b<brg>, ? extends App<bwj.c<brg>, bwm<brg>>>)($$1 -> $$1.group($$1.a(cah.n), $$1.b(cah.o), $$1.c(cah.p), $$1.b(cah.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bre $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<caj>b($$5).a($$9)) {
                        $$2.a(new bth($$9, true));
                        $$7.a(bop.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(brg $$0) {
      return $$0.b($$1 -> {
         cry $$2 = $$1.f();
         return $$2 instanceof csu && $$0.a((csu)$$2);
      });
   }
}
