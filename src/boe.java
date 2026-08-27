import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boe {
   private static final int a = 1;

   public static bmy<blg> a(float $$0) {
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$1 -> $$1.group($$1.a(buh.n), $$1.c(buh.m), $$1.b(buh.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        bkq $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bni($$8, true));
                           $$3.a(new buk(new bni($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
