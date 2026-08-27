import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bms {
   private static final int a = 1;

   public static bkp<biy> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bkp<biy> a(Function<biw, Float> $$0) {
      return boa.a(
         (Function<boa.b<biy>, ? extends App<boa.c<biy>, bod<biy>>>)($$1 -> $$1.group($$1.a(bry.m), $$1.a(bry.n), $$1.b(bry.o), $$1.a(bry.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     biw $$9 = $$1.b($$4);
                     Optional<bsa> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bkq.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bkz($$9, true));
                        $$2.a(new bsb(new bkz($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
