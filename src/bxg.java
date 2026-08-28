import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxg {
   private static final float a = 0.3F;

   public static bwg<btc> a() {
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$0 -> $$0.group($$0.a(ccg.m), $$0.a(ccg.n), $$0.b(ccg.e), $$0.b(ccg.h), $$0.c(ccg.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ji $$9 = $$0.b($$3);
                     cci $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.dp(), 4.0) && $$10.d($$0xxx -> bsn.bj.equals($$0xxx.am()))) {
                        $$10.a($$1xx -> bsn.bj.equals($$1xx.am()) && $$1xx.g((bsh)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvg($$3xx, true));
                           $$1.a(new ccj(new bvg($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
