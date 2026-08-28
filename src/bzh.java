import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzh {
   private static final int a = 1;

   public static bya<bwg> a(float $$0) {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$1 -> $$1.group($$1.a(cfk.n), $$1.c(cfk.m), $$1.b(cfk.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bvk $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new byk($$8, true));
                           $$3.a(new cfn(new byk($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
