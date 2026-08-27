import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpg {
   private static final int a = 1;

   public static bnd<bln> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bnd<bln> a(Function<bll, Float> $$0) {
      return bqo.a(
         (Function<bqo.b<bln>, ? extends App<bqo.c<bln>, bqr<bln>>>)($$1 -> $$1.group($$1.a(bum.m), $$1.a(bum.n), $$1.b(bum.o), $$1.a(bum.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bll $$9 = $$1.b($$4);
                     Optional<buo> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bne.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bnn($$9, true));
                        $$2.a(new bup(new bnn($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
