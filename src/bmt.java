import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmt {
   private static final int a = 1;

   public static bkq<bja> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bkq<bja> a(Function<biy, Float> $$0) {
      return bob.a(
         (Function<bob.b<bja>, ? extends App<bob.c<bja>, boe<bja>>>)($$1 -> $$1.group($$1.a(brz.m), $$1.a(brz.n), $$1.b(brz.o), $$1.a(brz.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     biy $$9 = $$1.b($$4);
                     Optional<bsb> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bkr.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bla($$9, true));
                        $$2.a(new bsc(new bla($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
