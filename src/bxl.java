import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxl {
   private static final int a = 1;

   public static bvh<btp> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bvh<btp> a(Function<btn, Float> $$0) {
      return byt.a(
         (Function<byt.b<btp>, ? extends App<byt.c<btp>, byw<btp>>>)($$1 -> $$1.group($$1.a(ccr.m), $$1.a(ccr.n), $$1.b(ccr.o), $$1.a(ccr.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btn $$9 = $$1.b($$4);
                     Optional<cct> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bvi.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvr($$9, true));
                        $$2.a(new ccu(new bvr($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
