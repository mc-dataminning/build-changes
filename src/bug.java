import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bug {
   public static bvu<brq> a(bph $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bvu<brq> a(bph $$0, Function<bsq, Float> $$1) {
      return bxw.a(
         (Function<bxw.b<brq>, ? extends App<bxw.c<brq>, bxz<brq>>>)($$2 -> $$2.group($$2.b(cbu.K), $$2.a(cbu.n), $$2.c(cbu.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        brq $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cbx $$10 = new cbx(new buu($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new buu($$9, true));
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
