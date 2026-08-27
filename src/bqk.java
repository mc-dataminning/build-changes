import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqk {
   private static final int a = 1;

   public static bog<bmq> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bog<bmq> a(Function<bmo, Float> $$0) {
      return brs.a(
         (Function<brs.b<bmq>, ? extends App<brs.c<bmq>, brv<bmq>>>)($$1 -> $$1.group($$1.a(bvq.m), $$1.a(bvq.n), $$1.b(bvq.o), $$1.a(bvq.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bmo $$9 = $$1.b($$4);
                     Optional<bvs> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && boh.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new boq($$9, true));
                        $$2.a(new bvt(new boq($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
