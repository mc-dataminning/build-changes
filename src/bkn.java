import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkn {
   public static bma<bid> a(bgb $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bma<bid> a(bgb $$0, Function<biy, Float> $$1) {
      return boc.a(
         (Function<boc.b<bid>, ? extends App<boc.c<bid>, bof<bid>>>)($$2 -> $$2.group($$2.b(bsa.J), $$2.a(bsa.n), $$2.c(bsa.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.i_()) {
                        return false;
                     } else {
                        bid $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bsd $$10 = new bsd(new blb($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new blb($$9, true));
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
