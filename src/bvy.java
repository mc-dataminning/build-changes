import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvy {
   public static bwc<bta> a(int $$0) {
      return bye.a(
         (Function<bye.b<bta>, ? extends App<bye.c<bta>, byh<bta>>>)($$1 -> $$1.group($$1.a(ccc.n), $$1.b(ccc.o), $$1.c(ccc.p), $$1.b(ccc.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bsy $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cce>b($$5).a($$9)) {
                        $$2.a(new bvc($$9, true));
                        $$7.a(bqc.a);
                        $$7.D($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bta $$0) {
      return $$0.b($$1 -> {
         ctv $$2 = $$1.g();
         return $$2 instanceof cut && $$0.a((cut)$$2);
      });
   }
}
