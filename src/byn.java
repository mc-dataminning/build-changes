import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byn {
   public static cab<bvq> a(btj $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static cab<bvq> a(btj $$0, Function<bwz, Float> $$1) {
      return ccd.a(
         (Function<ccd.b<bvq>, ? extends App<ccd.c<bvq>, ccg<bvq>>>)($$2 -> $$2.group($$2.b(cgb.L), $$2.a(cgb.o), $$2.c(cgb.n))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bvq $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cge $$10 = new cge(new bzb($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bzb($$9, true));
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
