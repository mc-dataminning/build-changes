import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwc {
   private static final int a = 1;

   public static buv<btb> a(float $$0) {
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$1 -> $$1.group($$1.a(ccf.n), $$1.c(ccf.m), $$1.b(ccf.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bS()) {
                        return false;
                     } else {
                        bsg $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvf($$8, true));
                           $$3.a(new cci(new bvf($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
