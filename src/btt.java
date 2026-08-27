import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btt {
   private static final int a = 1;

   public static bsm<bqt> a(float $$0) {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$1 -> $$1.group($$1.a(bzw.n), $$1.c(bzw.m), $$1.b(bzw.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        bqa $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bsw($$8, true));
                           $$3.a(new bzz(new bsw($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
