import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmm {
   public static bnz<bkd> a(bib $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bnz<bkd> a(bib $$0, Function<bky, Float> $$1) {
      return bqb.a(
         (Function<bqb.b<bkd>, ? extends App<bqb.c<bkd>, bqe<bkd>>>)($$2 -> $$2.group($$2.b(btz.J), $$2.a(btz.n), $$2.c(btz.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bkd $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           buc $$10 = new buc(new bna($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bna($$9, true));
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
