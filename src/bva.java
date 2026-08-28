import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bva {
   public static bwo<bsj> a(bqa $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bwo<bsj> a(bqa $$0, Function<btk, Float> $$1) {
      return byq.a(
         (Function<byq.b<bsj>, ? extends App<byq.c<bsj>, byt<bsj>>>)($$2 -> $$2.group($$2.b(cco.K), $$2.a(cco.n), $$2.c(cco.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        bsj $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           ccr $$10 = new ccr(new bvo($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bvo($$9, true));
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
