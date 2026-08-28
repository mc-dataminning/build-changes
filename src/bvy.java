import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvy {
   private static jd a(btn $$0, jd $$1) {
      ayv $$2 = $$0.dQ().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ayv $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends btn> bwq<E> a(ccq<jd> $$0, int $$1, float $$2) {
      return bys.a(
         (Function<bys.b<E>, ? extends App<bys.c<E>, byv<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(ccq.o), $$3.c(ccq.m), $$3.a(ccq.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jd $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dq(), (double)$$1);
                     if (!$$8) {
                        bvh.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
