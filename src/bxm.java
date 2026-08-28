import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxm {
   private static final int a = 1;

   public static bvi<btp> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bvi<btp> a(Function<btn, Float> $$0) {
      return byu.a(
         (Function<byu.b<btp>, ? extends App<byu.c<btp>, byx<btp>>>)($$1 -> $$1.group($$1.a(ccs.m), $$1.a(ccs.n), $$1.b(ccs.o), $$1.a(ccs.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btn $$9 = $$1.b($$4);
                     Optional<ccu> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bvj.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvs($$9, true));
                        $$2.a(new ccv(new bvs($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
