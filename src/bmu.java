import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmu {
   public static boh<bkl> a(bii $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static boh<bkl> a(bii $$0, Function<blg, Float> $$1) {
      return bqj.a(
         (Function<bqj.b<bkl>, ? extends App<bqj.c<bkl>, bqm<bkl>>>)($$2 -> $$2.group($$2.b(buh.J), $$2.a(buh.n), $$2.c(buh.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bkl $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           buk $$10 = new buk(new bni($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bni($$9, true));
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
