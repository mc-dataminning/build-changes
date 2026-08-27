import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blz {
   private static final int a = 1;

   public static bkt<bjb> a(float $$0) {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$1 -> $$1.group($$1.a(bsc.n), $$1.c(bsc.m), $$1.b(bsc.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bN()) {
                        return false;
                     } else {
                        bil $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bld($$8, true));
                           $$3.a(new bsf(new bld($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
