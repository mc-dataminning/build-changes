import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boi {
   public static bom<bln> a(int $$0) {
      return bqo.a(
         (Function<bqo.b<bln>, ? extends App<bqo.c<bln>, bqr<bln>>>)($$1 -> $$1.group($$1.a(bum.n), $$1.b(bum.o), $$1.c(bum.p), $$1.b(bum.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bll $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<buo>b($$5).a($$9)) {
                        $$2.a(new bnn($$9, true));
                        $$7.a(bja.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bln $$0) {
      return $$0.b($$1 -> {
         clj $$2 = $$1.d();
         return $$2 instanceof cme && $$0.a((cme)$$2);
      });
   }
}
