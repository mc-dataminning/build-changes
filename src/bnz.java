import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnz {
   public static bpn<blq> a(bjm $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bpn<blq> a(bjm $$0, Function<bml, Float> $$1) {
      return brp.a(
         (Function<brp.b<blq>, ? extends App<brp.c<blq>, brs<blq>>>)($$2 -> $$2.group($$2.b(bvn.J), $$2.a(bvn.n), $$2.c(bvn.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        blq $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bvq $$10 = new bvq(new bon($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bon($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
