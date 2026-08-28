import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byt {
   private static final int a = 1;

   public static bwp<bux> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bwp<bux> a(Function<buv, Float> $$0) {
      return cab.a(
         (Function<cab.b<bux>, ? extends App<cab.c<bux>, cae<bux>>>)($$1 -> $$1.group($$1.a(cdz.m), $$1.a(cdz.n), $$1.b(cdz.o), $$1.a(cdz.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     buv $$9 = $$1.b($$4);
                     Optional<ceb> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bwq.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bwz($$9, true));
                        $$2.a(new cec(new bwz($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
