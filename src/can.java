import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class can {
   private static final int a = 1;

   public static byj<bwt> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static byj<bwt> a(Function<bwr, Float> $$0) {
      return cbv.a(
         (Function<cbv.b<bwt>, ? extends App<cbv.c<bwt>, cby<bwt>>>)($$1 -> $$1.group($$1.a(cft.n), $$1.a(cft.o), $$1.b(cft.p), $$1.a(cft.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bwr $$9 = $$1.b($$4);
                     Optional<cfv> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && byk.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new byt($$9, true));
                        $$2.a(new cfw(new byt($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
