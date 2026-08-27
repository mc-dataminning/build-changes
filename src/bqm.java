import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqm {
   public static bsa<boa> a(blw $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bsa<boa> a(blw $$0, Function<box, Float> $$1) {
      return buc.a(
         (Function<buc.b<boa>, ? extends App<buc.c<boa>, buf<boa>>>)($$2 -> $$2.group($$2.b(bya.K), $$2.a(bya.n), $$2.c(bya.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        boa $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           byd $$10 = new byd(new bra($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bra($$9, true));
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
