import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxr {
   public static bzf<buw> a(bsp $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bzf<buw> a(bsp $$0, Function<bwb, Float> $$1) {
      return cbh.a(
         (Function<cbh.b<buw>, ? extends App<cbh.c<buw>, cbk<buw>>>)($$2 -> $$2.group($$2.b(cff.K), $$2.a(cff.n), $$2.c(cff.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.e_()) {
                        return false;
                     } else {
                        buw $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cfi $$10 = new cfi(new byf($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new byf($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
