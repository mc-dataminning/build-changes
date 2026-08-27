import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bvb {
   private static final int a = 1;

   public static bsx<brg> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bsx<brg> a(Function<bre, Float> $$0) {
      return bwj.a(
         (Function<bwj.b<brg>, ? extends App<bwj.c<brg>, bwm<brg>>>)($$1 -> $$1.group($$1.a(cah.m), $$1.a(cah.n), $$1.b(cah.o), $$1.a(cah.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bre $$9 = $$1.b($$4);
                     Optional<caj> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bsy.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bth($$9, true));
                        $$2.a(new cak(new bth($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
