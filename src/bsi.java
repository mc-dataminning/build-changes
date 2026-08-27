import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsi {
   public static btw<bpu> a(bnq $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static btw<bpu> a(bnq $$0, Function<bqt, Float> $$1) {
      return bvy.a(
         (Function<bvy.b<bpu>, ? extends App<bvy.c<bpu>, bwb<bpu>>>)($$2 -> $$2.group($$2.b(bzw.K), $$2.a(bzw.n), $$2.c(bzw.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        bpu $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bzz $$10 = new bzz(new bsw($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bsw($$9, true));
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
