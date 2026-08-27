import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnh {
   private static final float a = 0.3F;

   public static bmh<bjg> a() {
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$0 -> $$0.group($$0.a(bsh.m), $$0.a(bsh.n), $$0.b(bsh.e), $$0.b(bsh.h), $$0.c(bsh.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     hf $$9 = $$0.b($$3);
                     bsj $$10 = $$0.b($$4);
                     if ($$6.D_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.dj(), 4.0) && $$10.d($$0xxx -> biu.bf.equals($$0xxx.ag()))) {
                        $$10.a($$1xx -> biu.bf.equals($$1xx.ag()) && $$1xx.f((biq)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bli($$3xx, true));
                           $$1.a(new bsk(new bli($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
