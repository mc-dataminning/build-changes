import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqp {
   private static hz a(boi $$0, hz $$1) {
      awo $$2 = $$0.dM().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(awo $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends boi> brh<E> a(bxh<hz> $$0, int $$1, float $$2) {
      return btj.a(
         (Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bxh.o), $$3.c(bxh.m), $$3.a(bxh.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     hz $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dm(), (double)$$1);
                     if (!$$8) {
                        bpy.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
