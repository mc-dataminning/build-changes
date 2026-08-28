import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccb {
   private static final int a = 1;

   public static bzx<byh> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bzx<byh> a(Function<byf, Float> $$0) {
      return cdj.a(
         (Function<cdj.b<byh>, ? extends App<cdj.c<byh>, cdm<byh>>>)($$1 -> $$1.group($$1.a(chh.n), $$1.a(chh.o), $$1.b(chh.p), $$1.a(chh.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     byf $$9 = $$1.b($$4);
                     Optional<chj> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bzy.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new cah($$9, true));
                        $$2.a(new chk(new cah($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
