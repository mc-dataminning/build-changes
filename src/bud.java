import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bud {
   public static bvr<brp> a(bpl $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bvr<brp> a(bpl $$0, Function<bso, Float> $$1) {
      return bxt.a(
         (Function<bxt.b<brp>, ? extends App<bxt.c<brp>, bxw<brp>>>)($$2 -> $$2.group($$2.b(cbr.K), $$2.a(cbr.n), $$2.c(cbr.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        brp $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cbu $$10 = new cbu(new bur($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bur($$9, true));
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
