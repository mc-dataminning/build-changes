import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class boe {
   private static final int a = 1;

   public static bmb<bkl> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bmb<bkl> a(Function<bkj, Float> $$0) {
      return bpm.a(
         (Function<bpm.b<bkl>, ? extends App<bpm.c<bkl>, bpp<bkl>>>)($$1 -> $$1.group($$1.a(btk.m), $$1.a(btk.n), $$1.b(btk.o), $$1.a(btk.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bkj $$9 = $$1.b($$4);
                     Optional<btm> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bmc.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bml($$9, true));
                        $$2.a(new btn(new bml($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
