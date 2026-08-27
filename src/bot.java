import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bot {
   private static final int a = 1;

   public static bmq<bla> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bmq<bla> a(Function<bky, Float> $$0) {
      return bqb.a(
         (Function<bqb.b<bla>, ? extends App<bqb.c<bla>, bqe<bla>>>)($$1 -> $$1.group($$1.a(btz.m), $$1.a(btz.n), $$1.b(btz.o), $$1.a(btz.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bky $$9 = $$1.b($$4);
                     Optional<bub> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bmr.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bna($$9, true));
                        $$2.a(new buc(new bna($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
