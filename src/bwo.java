import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwo {
   private static final int a = 1;

   public static buk<bss> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static buk<bss> a(Function<bsq, Float> $$0) {
      return bxw.a(
         (Function<bxw.b<bss>, ? extends App<bxw.c<bss>, bxz<bss>>>)($$1 -> $$1.group($$1.a(cbu.m), $$1.a(cbu.n), $$1.b(cbu.o), $$1.a(cbu.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bsq $$9 = $$1.b($$4);
                     Optional<cbw> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bul.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new buu($$9, true));
                        $$2.a(new cbx(new buu($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
