import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpm {
   private static final float a = 0.3F;

   public static bom<bll> a() {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$0 -> $$0.group($$0.a(bum.m), $$0.a(bum.n), $$0.b(bum.e), $$0.b(bum.h), $$0.c(bum.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ie $$9 = $$0.b($$3);
                     buo $$10 = $$0.b($$4);
                     if ($$6.F_().a(100) == 0 && $$6.ad() == $$9.a() && $$9.b().a($$7.dl(), 4.0) && $$10.d($$0xxx -> bkz.bf.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bkz.bf.equals($$1xx.ai()) && $$1xx.f((bkv)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bnn($$3xx, true));
                           $$1.a(new bup(new bnn($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
