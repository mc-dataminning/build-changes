import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmu {
   private static final int a = 1;

   public static bkr<bja> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bkr<bja> a(Function<biy, Float> $$0) {
      return boc.a(
         (Function<boc.b<bja>, ? extends App<boc.c<bja>, bof<bja>>>)($$1 -> $$1.group($$1.a(bsa.m), $$1.a(bsa.n), $$1.b(bsa.o), $$1.a(bsa.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     biy $$9 = $$1.b($$4);
                     Optional<bsc> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bks.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new blb($$9, true));
                        $$2.a(new bsd(new blb($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
