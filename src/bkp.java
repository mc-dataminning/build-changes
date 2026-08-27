import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkp {
   public static bmc<big> a(bge $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bmc<big> a(bge $$0, Function<bjb, Float> $$1) {
      return boe.a(
         (Function<boe.b<big>, ? extends App<boe.c<big>, boh<big>>>)($$2 -> $$2.group($$2.b(bsc.J), $$2.a(bsc.n), $$2.c(bsc.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.i_()) {
                        return false;
                     } else {
                        big $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bsf $$10 = new bsf(new bld($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bld($$9, true));
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
