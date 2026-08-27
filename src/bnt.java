import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnt {
   public static bph<blk> a(bjg $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bph<blk> a(bjg $$0, Function<bmf, Float> $$1) {
      return brj.a(
         (Function<brj.b<blk>, ? extends App<brj.c<blk>, brm<blk>>>)($$2 -> $$2.group($$2.b(bvh.J), $$2.a(bvh.n), $$2.c(bvh.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        blk $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bvk $$10 = new bvk(new boh($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new boh($$9, true));
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
