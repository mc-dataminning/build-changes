import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzg {
   private static final int a = 1;

   public static bxc<bvk> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bxc<bvk> a(Function<bvi, Float> $$0) {
      return cao.a(
         (Function<cao.b<bvk>, ? extends App<cao.c<bvk>, car<bvk>>>)($$1 -> $$1.group($$1.a(cem.m), $$1.a(cem.n), $$1.b(cem.o), $$1.a(cem.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bvi $$9 = $$1.b($$4);
                     Optional<ceo> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bxd.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bxm($$9, true));
                        $$2.a(new cep(new bxm($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
