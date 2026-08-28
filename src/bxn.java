import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxn {
   public static bzb<bus> a(bsl $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bzb<bus> a(bsl $$0, Function<bvx, Float> $$1) {
      return cbd.a(
         (Function<cbd.b<bus>, ? extends App<cbd.c<bus>, cbg<bus>>>)($$2 -> $$2.group($$2.b(cfb.K), $$2.a(cfb.n), $$2.c(cfb.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.e_()) {
                        return false;
                     } else {
                        bus $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cfe $$10 = new cfe(new byb($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new byb($$9, true));
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
