import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwr {
   private static final float a = 0.3F;

   public static bvr<bso> a() {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$0 -> $$0.group($$0.a(cbr.m), $$0.a(cbr.n), $$0.b(cbr.e), $$0.b(cbr.h), $$0.c(cbr.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     iz $$9 = $$0.b($$3);
                     cbt $$10 = $$0.b($$4);
                     if ($$6.F_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.ds(), 4.0) && $$10.d($$0xxx -> bsb.bn.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> bsb.bn.equals($$1xx.ak()) && $$1xx.g((brv)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bur($$3xx, true));
                           $$1.a(new cbu(new bur($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
