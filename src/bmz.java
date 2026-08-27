import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmz {
   public static bom<bkq> a(bim $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bom<bkq> a(bim $$0, Function<bll, Float> $$1) {
      return bqo.a(
         (Function<bqo.b<bkq>, ? extends App<bqo.c<bkq>, bqr<bkq>>>)($$2 -> $$2.group($$2.b(bum.J), $$2.a(bum.n), $$2.c(bum.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bkq $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bup $$10 = new bup(new bnn($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bnn($$9, true));
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
