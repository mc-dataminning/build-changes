import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cad {
   private static final int a = 1;

   public static byw<bxe> a(float $$0) {
      return cci.a(
         (Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$1 -> $$1.group($$1.a(cgg.o), $$1.c(cgg.n), $$1.b(cgg.t))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bwf $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bzg($$8, true));
                           $$3.a(new cgj(new bzg($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
