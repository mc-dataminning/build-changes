import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzt {
   public static cbh<bwu> a(bun $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static cbh<bwu> a(bun $$0, Function<byf, Float> $$1) {
      return cdj.a(
         (Function<cdj.b<bwu>, ? extends App<cdj.c<bwu>, cdm<bwu>>>)($$2 -> $$2.group($$2.b(chh.L), $$2.a(chh.o), $$2.c(chh.n))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.e_()) {
                        return false;
                     } else {
                        bwu $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           chk $$10 = new chk(new cah($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new cah($$9, true));
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
