import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbq {
   private static final int a = 1;

   public static bzm<bxw> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bzm<bxw> a(Function<bxu, Float> $$0) {
      return ccy.a(
         (Function<ccy.b<bxw>, ? extends App<ccy.c<bxw>, cdb<bxw>>>)($$1 -> $$1.group($$1.a(cgw.n), $$1.a(cgw.o), $$1.b(cgw.p), $$1.a(cgw.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bxu $$9 = $$1.b($$4);
                     Optional<cgy> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bzn.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bzw($$9, true));
                        $$2.a(new cgz(new bzw($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
