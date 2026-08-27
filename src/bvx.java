import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bvx {
   private static final int a = 1;

   public static btt<bsc> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static btt<bsc> a(Function<bsa, Float> $$0) {
      return bxf.a(
         (Function<bxf.b<bsc>, ? extends App<bxf.c<bsc>, bxi<bsc>>>)($$1 -> $$1.group($$1.a(cbd.m), $$1.a(cbd.n), $$1.b(cbd.o), $$1.a(cbd.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bsa $$9 = $$1.b($$4);
                     Optional<cbf> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && btu.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bud($$9, true));
                        $$2.a(new cbg(new bud($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
