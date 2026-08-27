import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brd {
   public static brh<boi> a(int $$0) {
      return btj.a(
         (Function<btj.b<boi>, ? extends App<btj.c<boi>, btm<boi>>>)($$1 -> $$1.group($$1.a(bxh.n), $$1.b(bxh.o), $$1.c(bxh.p), $$1.b(bxh.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bog $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bxj>b($$5).a($$9)) {
                        $$2.a(new bqh($$9, true));
                        $$7.a(blt.a);
                        $$7.B($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(boi $$0) {
      return $$0.b($$1 -> {
         cou $$2 = $$1.d();
         return $$2 instanceof cpp && $$0.a((cpp)$$2);
      });
   }
}
