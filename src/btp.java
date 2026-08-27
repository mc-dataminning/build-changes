import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btp {
   public static bvd<brb> a(box $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bvd<brb> a(box $$0, Function<bsa, Float> $$1) {
      return bxf.a(
         (Function<bxf.b<brb>, ? extends App<bxf.c<brb>, bxi<brb>>>)($$2 -> $$2.group($$2.b(cbd.K), $$2.a(cbd.n), $$2.c(cbd.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        brb $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cbg $$10 = new cbg(new bud($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bud($$9, true));
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
