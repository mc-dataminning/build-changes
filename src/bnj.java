import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnj {
   private static final float a = 0.3F;

   public static bmj<bji> a() {
      return bol.a(
         (Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$0 -> $$0.group($$0.a(bsj.m), $$0.a(bsj.n), $$0.b(bsj.e), $$0.b(bsj.h), $$0.c(bsj.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     hf $$9 = $$0.b($$3);
                     bsl $$10 = $$0.b($$4);
                     if ($$6.D_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.dj(), 4.0) && $$10.d($$0xxx -> biw.bf.equals($$0xxx.ag()))) {
                        $$10.a($$1xx -> biw.bf.equals($$1xx.ag()) && $$1xx.f((bis)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new blk($$3xx, true));
                           $$1.a(new bsm(new blk($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
