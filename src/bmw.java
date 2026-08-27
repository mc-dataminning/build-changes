import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmw {
   private static final int a = 1;

   public static bkt<bjd> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bkt<bjd> a(Function<bjb, Float> $$0) {
      return boe.a(
         (Function<boe.b<bjd>, ? extends App<boe.c<bjd>, boh<bjd>>>)($$1 -> $$1.group($$1.a(bsc.m), $$1.a(bsc.n), $$1.b(bsc.o), $$1.a(bsc.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bjb $$9 = $$1.b($$4);
                     Optional<bse> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bku.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bld($$9, true));
                        $$2.a(new bsf(new bld($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
