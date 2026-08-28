import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwc {
   public static bxq<btk> a(brd $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bxq<btk> a(brd $$0, Function<bun, Float> $$1) {
      return bzs.a(
         (Function<bzs.b<btk>, ? extends App<bzs.c<btk>, bzv<btk>>>)($$2 -> $$2.group($$2.b(cdq.K), $$2.a(cdq.n), $$2.c(cdq.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        btk $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cdt $$10 = new cdt(new bwq($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bwq($$9, true));
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
