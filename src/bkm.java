import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkm {
   public static blz<bid> a(bgb $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static blz<bid> a(bgb $$0, Function<biy, Float> $$1) {
      return bob.a(
         (Function<bob.b<bid>, ? extends App<bob.c<bid>, boe<bid>>>)($$2 -> $$2.group($$2.b(brz.J), $$2.a(brz.n), $$2.c(brz.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.i_()) {
                        return false;
                     } else {
                        bid $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bsc $$10 = new bsc(new bla($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bla($$9, true));
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
