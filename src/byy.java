import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byy {
   private static final int a = 1;

   public static bwu<bvc> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bwu<bvc> a(Function<bva, Float> $$0) {
      return cag.a(
         (Function<cag.b<bvc>, ? extends App<cag.c<bvc>, caj<bvc>>>)($$1 -> $$1.group($$1.a(cee.m), $$1.a(cee.n), $$1.b(cee.o), $$1.a(cee.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bva $$9 = $$1.b($$4);
                     Optional<ceg> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bwv.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bxe($$9, true));
                        $$2.a(new ceh(new bxe($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
