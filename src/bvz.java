import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvz {
   private static final int a = 1;

   public static bus<bsy> a(float $$0) {
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$1 -> $$1.group($$1.a(ccc.n), $$1.c(ccc.m), $$1.b(ccc.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bR()) {
                        return false;
                     } else {
                        bsd $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvc($$8, true));
                           $$3.a(new ccf(new bvc($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
