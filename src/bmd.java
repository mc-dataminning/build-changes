import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmd {
   public static bmh<bji> a(int $$0) {
      return boj.a(
         (Function<boj.b<bji>, ? extends App<boj.c<bji>, bom<bji>>>)($$1 -> $$1.group($$1.a(bsh.n), $$1.b(bsh.o), $$1.c(bsh.p), $$1.b(bsh.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bjg $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bsj>b($$5).a($$9)) {
                        $$2.a(new bli($$9, true));
                        $$7.a(bgx.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bji $$0) {
      return $$0.b($$1 -> {
         cja $$2 = $$1.d();
         return $$2 instanceof cjv && $$0.a((cjv)$$2);
      });
   }
}
