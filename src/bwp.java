import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwp {
   private static final int a = 1;

   public static bvi<btn> a(float $$0) {
      return byu.a(
         (Function<byu.b<btn>, ? extends App<byu.c<btn>, byx<btn>>>)($$1 -> $$1.group($$1.a(ccs.n), $$1.c(ccs.m), $$1.b(ccs.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bS()) {
                        return false;
                     } else {
                        bsr $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvs($$8, true));
                           $$3.a(new ccv(new bvs($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
