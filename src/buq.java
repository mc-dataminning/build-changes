import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class buq {
   private static final int a = 1;

   public static bsm<bqv> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bsm<bqv> a(Function<bqt, Float> $$0) {
      return bvy.a(
         (Function<bvy.b<bqv>, ? extends App<bvy.c<bqv>, bwb<bqv>>>)($$1 -> $$1.group($$1.a(bzw.m), $$1.a(bzw.n), $$1.b(bzw.o), $$1.a(bzw.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bqt $$9 = $$1.b($$4);
                     Optional<bzy> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bsn.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bsw($$9, true));
                        $$2.a(new bzz(new bsw($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
