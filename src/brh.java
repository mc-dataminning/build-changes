import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brh {
   public static brl<bok> a(int $$0) {
      return btn.a(
         (Function<btn.b<bok>, ? extends App<btn.c<bok>, btq<bok>>>)($$1 -> $$1.group($$1.a(bxl.n), $$1.b(bxl.o), $$1.c(bxl.p), $$1.b(bxl.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     boi $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bxn>b($$5).a($$9)) {
                        $$2.a(new bql($$9, true));
                        $$7.a(blv.a);
                        $$7.B($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bok $$0) {
      return $$0.b($$1 -> {
         coy $$2 = $$1.d();
         return $$2 instanceof cpt && $$0.a((cpt)$$2);
      });
   }
}
