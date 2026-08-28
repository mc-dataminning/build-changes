import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cat {
   private static final int a = 1;

   public static bzm<bxu> a(float $$0) {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$1 -> $$1.group($$1.a(cgw.o), $$1.c(cgw.n), $$1.b(cgw.t))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bY()) {
                        return false;
                     } else {
                        bwt $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bzw($$8, true));
                           $$3.a(new cgz(new bzw($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
