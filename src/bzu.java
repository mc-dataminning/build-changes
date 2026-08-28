import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzu {
   public static cbh<byh> a(int $$0, float $$1) {
      return cdj.a(
         (Function<cdj.b<byh>, ? extends App<cdj.c<byh>, cdm<byh>>>)($$2 -> $$2.group($$2.c(chh.n), $$2.a(chh.o), $$2.b(chh.p), $$2.b(chh.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     byf $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<chj>b($$6).a($$9)) {
                        $$4.a(new cah($$9, true));
                        $$7.K().a(-$$1, 0.0F);
                        $$7.w(azz.c($$7.dL(), $$7.aX, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
