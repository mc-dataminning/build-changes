import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bue {
   private static final int a = 1;

   public static bsx<bre> a(float $$0) {
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$1 -> $$1.group($$1.a(cah.n), $$1.c(cah.m), $$1.b(cah.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bP()) {
                        return false;
                     } else {
                        bql $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bth($$8, true));
                           $$3.a(new cak(new bth($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
