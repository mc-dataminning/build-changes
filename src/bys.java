import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bys {
   public static cag<bvv> a(bto $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static cag<bvv> a(bto $$0, Function<bxe, Float> $$1) {
      return cci.a(
         (Function<cci.b<bvv>, ? extends App<cci.c<bvv>, ccl<bvv>>>)($$2 -> $$2.group($$2.b(cgg.L), $$2.a(cgg.o), $$2.c(cgg.n))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bvv $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cgj $$10 = new cgj(new bzg($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bzg($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
