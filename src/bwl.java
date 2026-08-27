import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwl {
   private static final int a = 1;

   public static buh<bsq> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static buh<bsq> a(Function<bso, Float> $$0) {
      return bxt.a(
         (Function<bxt.b<bsq>, ? extends App<bxt.c<bsq>, bxw<bsq>>>)($$1 -> $$1.group($$1.a(cbr.m), $$1.a(cbr.n), $$1.b(cbr.o), $$1.a(cbr.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bso $$9 = $$1.b($$4);
                     Optional<cbt> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bui.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bur($$9, true));
                        $$2.a(new cbu(new bur($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
