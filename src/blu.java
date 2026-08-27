import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blu {
   public static bly<biy> a(int $$0) {
      return boa.a(
         (Function<boa.b<biy>, ? extends App<boa.c<biy>, bod<biy>>>)($$1 -> $$1.group($$1.a(bry.n), $$1.b(bry.o), $$1.c(bry.p), $$1.b(bry.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     biw $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.k($$9) && $$1.<bsa>b($$5).a($$9)) {
                        $$2.a(new bkz($$9, true));
                        $$7.a(bgn.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(biy $$0) {
      return $$0.b($$1 -> {
         cir $$2 = $$1.d();
         return $$2 instanceof cjm && $$0.a((cjm)$$2);
      });
   }
}
