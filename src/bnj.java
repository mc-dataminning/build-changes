import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnj {
   public static box<bla> a(biw $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static box<bla> a(biw $$0, Function<blv, Float> $$1) {
      return bqz.a(
         (Function<bqz.b<bla>, ? extends App<bqz.c<bla>, brc<bla>>>)($$2 -> $$2.group($$2.b(bux.J), $$2.a(bux.n), $$2.c(bux.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bla $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bva $$10 = new bva(new bnx($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bnx($$9, true));
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
