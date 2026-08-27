import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class btm {
   private static final int a = 1;

   public static bri<bpr> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bri<bpr> a(Function<bpp, Float> $$0) {
      return buu.a(
         (Function<buu.b<bpr>, ? extends App<buu.c<bpr>, bux<bpr>>>)($$1 -> $$1.group($$1.a(bys.m), $$1.a(bys.n), $$1.b(bys.o), $$1.a(bys.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bpp $$9 = $$1.b($$4);
                     Optional<byu> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && brj.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new brs($$9, true));
                        $$2.a(new byv(new brs($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
