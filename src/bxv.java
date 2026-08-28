import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxv {
   public static bzj<bva> a(bst $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bzj<bva> a(bst $$0, Function<bwf, Float> $$1) {
      return cbl.a(
         (Function<cbl.b<bva>, ? extends App<cbl.c<bva>, cbo<bva>>>)($$2 -> $$2.group($$2.b(cfj.K), $$2.a(cfj.n), $$2.c(cfj.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.e_()) {
                        return false;
                     } else {
                        bva $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cfm $$10 = new cfm(new byj($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new byj($$9, true));
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
