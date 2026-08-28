import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bww {
   private static final int a = 1;

   public static bus<bta> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bus<bta> a(Function<bsy, Float> $$0) {
      return bye.a(
         (Function<bye.b<bta>, ? extends App<bye.c<bta>, byh<bta>>>)($$1 -> $$1.group($$1.a(ccc.m), $$1.a(ccc.n), $$1.b(ccc.o), $$1.a(ccc.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bsy $$9 = $$1.b($$4);
                     Optional<cce> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && but.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvc($$9, true));
                        $$2.a(new ccf(new bvc($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
