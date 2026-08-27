import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bst {
   public static buh<bqf> a(bob $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static buh<bqf> a(bob $$0, Function<bre, Float> $$1) {
      return bwj.a(
         (Function<bwj.b<bqf>, ? extends App<bwj.c<bqf>, bwm<bqf>>>)($$2 -> $$2.group($$2.b(cah.K), $$2.a(cah.n), $$2.c(cah.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        bqf $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cak $$10 = new cak(new bth($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bth($$9, true));
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
