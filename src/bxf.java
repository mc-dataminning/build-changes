import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxf {
   private static final int a = 1;

   public static bvy<buf> a(float $$0) {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$1 -> $$1.group($$1.a(cdi.n), $$1.c(cdi.m), $$1.b(cdi.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bW()) {
                        return false;
                     } else {
                        btj $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bwi($$8, true));
                           $$3.a(new cdl(new bwi($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
