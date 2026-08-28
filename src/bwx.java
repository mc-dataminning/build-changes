import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwx {
   public static byl<buc> a(brv $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static byl<buc> a(brv $$0, Function<bvh, Float> $$1) {
      return can.a(
         (Function<can.b<buc>, ? extends App<can.c<buc>, caq<buc>>>)($$2 -> $$2.group($$2.b(cel.K), $$2.a(cel.n), $$2.c(cel.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.e_()) {
                        return false;
                     } else {
                        buc $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           ceo $$10 = new ceo(new bxl($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bxl($$9, true));
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
