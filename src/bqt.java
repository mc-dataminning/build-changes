import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqt {
   private static hz a(bok $$0, hz $$1) {
      awp $$2 = $$0.dM().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(awp $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bok> brl<E> a(bxl<hz> $$0, int $$1, float $$2) {
      return btn.a(
         (Function<btn.b<E>, ? extends App<btn.c<E>, btq<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bxl.o), $$3.c(bxl.m), $$3.a(bxl.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     hz $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dm(), (double)$$1);
                     if (!$$8) {
                        bqc.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
