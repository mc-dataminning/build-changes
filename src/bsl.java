import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsl {
   private static final float a = 0.3F;

   public static brl<boi> a() {
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$0 -> $$0.group($$0.a(bxl.m), $$0.a(bxl.n), $$0.b(bxl.e), $$0.b(bxl.h), $$0.c(bxl.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ii $$9 = $$0.b($$3);
                     bxn $$10 = $$0.b($$4);
                     if ($$6.F_().a(100) == 0 && $$6.ad() == $$9.a() && $$9.b().a($$7.dk(), 4.0) && $$10.d($$0xxx -> bnw.bh.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bnw.bh.equals($$1xx.ai()) && $$1xx.f((bnq)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bql($$3xx, true));
                           $$1.a(new bxo(new bql($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
