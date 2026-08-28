import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbs {
   private static final int a = 1;

   public static bzo<bxy> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bzo<bxy> a(Function<bxw, Float> $$0) {
      return cda.a(
         (Function<cda.b<bxy>, ? extends App<cda.c<bxy>, cdd<bxy>>>)($$1 -> $$1.group($$1.a(cgy.n), $$1.a(cgy.o), $$1.b(cgy.p), $$1.a(cgy.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bxw $$9 = $$1.b($$4);
                     Optional<cha> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bzp.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bzy($$9, true));
                        $$2.a(new chb(new bzy($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
