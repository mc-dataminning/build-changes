import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxc {
   private static final float a = 0.3F;

   public static bwc<bsy> a() {
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$0 -> $$0.group($$0.a(ccc.m), $$0.a(ccc.n), $$0.b(ccc.e), $$0.b(ccc.h), $$0.c(ccc.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ji $$9 = $$0.b($$3);
                     cce $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.dn(), 4.0) && $$10.d($$0xxx -> bsj.bj.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> bsj.bj.equals($$1xx.ak()) && $$1xx.g((bsd)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvc($$3xx, true));
                           $$1.a(new ccf(new bvc($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
