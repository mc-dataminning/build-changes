import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxi {
   private static final int a = 1;

   public static bve<btm> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bve<btm> a(Function<btk, Float> $$0) {
      return byq.a(
         (Function<byq.b<btm>, ? extends App<byq.c<btm>, byt<btm>>>)($$1 -> $$1.group($$1.a(cco.m), $$1.a(cco.n), $$1.b(cco.o), $$1.a(cco.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btk $$9 = $$1.b($$4);
                     Optional<ccq> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bvf.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bvo($$9, true));
                        $$2.a(new ccr(new bvo($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
