import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byz {
   private static final int a = 1;

   public static bxs<bvy> a(float $$0) {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$1 -> $$1.group($$1.a(cfc.n), $$1.c(cfc.m), $$1.b(cfc.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bY()) {
                        return false;
                     } else {
                        bva $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new byc($$8, true));
                           $$3.a(new cff(new byc($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
