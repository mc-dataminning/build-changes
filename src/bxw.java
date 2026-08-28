import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxw {
   public static bzk<bvb> a(bsu $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bzk<bvb> a(bsu $$0, Function<bwg, Float> $$1) {
      return cbm.a(
         (Function<cbm.b<bvb>, ? extends App<cbm.c<bvb>, cbp<bvb>>>)($$2 -> $$2.group($$2.b(cfk.K), $$2.a(cfk.n), $$2.c(cfk.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.e_()) {
                        return false;
                     } else {
                        bvb $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cfn $$10 = new cfn(new byk($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new byk($$9, true));
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
