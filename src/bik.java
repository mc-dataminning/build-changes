import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bik {
   private static gu a(bgb $$0, gu $$1) {
      apf $$2 = $$0.dI().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(apf $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bgb> bjb<E> a(bpb<gu> $$0, int $$1, float $$2) {
      return bld.a(
         (Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bpb.o), $$3.c(bpb.m), $$3.a(bpb.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     gu $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.di(), (double)$$1);
                     if (!$$8) {
                        bht.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
