import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzc {
   private static final int a = 1;

   public static bxv<bwb> a(float $$0) {
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$1 -> $$1.group($$1.a(cff.n), $$1.c(cff.m), $$1.b(cff.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bvf $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new byf($$8, true));
                           $$3.a(new cfi(new byf($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
