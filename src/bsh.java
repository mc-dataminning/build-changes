import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsh {
   private static final float a = 0.3F;

   public static brh<bog> a() {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$0 -> $$0.group($$0.a(bxh.m), $$0.a(bxh.n), $$0.b(bxh.e), $$0.b(bxh.h), $$0.c(bxh.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ii $$9 = $$0.b($$3);
                     bxj $$10 = $$0.b($$4);
                     if ($$6.F_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dk(), 4.0) && $$10.d($$0xxx -> bnu.bh.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bnu.bh.equals($$1xx.ai()) && $$1xx.f((bno)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bqh($$3xx, true));
                           $$1.a(new bxk(new bqh($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
