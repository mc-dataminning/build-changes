import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpt {
   public static brh<bnj> a(blf $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static brh<bnj> a(blf $$0, Function<bog, Float> $$1) {
      return btj.a(
         (Function<btj.b<bnj>, ? extends App<btj.c<bnj>, btm<bnj>>>)($$2 -> $$2.group($$2.b(bxh.K), $$2.a(bxh.n), $$2.c(bxh.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bnj $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bxk $$10 = new bxk(new bqh($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bqh($$9, true));
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
