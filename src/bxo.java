import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxo {
   public static bzc<buq> a(bsj $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bzc<buq> a(bsj $$0, Function<bvy, Float> $$1) {
      return cbe.a(
         (Function<cbe.b<buq>, ? extends App<cbe.c<buq>, cbh<buq>>>)($$2 -> $$2.group($$2.b(cfc.K), $$2.a(cfc.n), $$2.c(cfc.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        buq $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cff $$10 = new cff(new byc($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new byc($$9, true));
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
