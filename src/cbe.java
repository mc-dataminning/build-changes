import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbe {
   private static final float a = 0.3F;

   public static cae<bxc> a() {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$0 -> $$0.group($$0.a(cge.n), $$0.a(cge.o), $$0.b(cge.e), $$0.b(cge.h), $$0.c(cge.r))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jd $$9 = $$0.b($$3);
                     cgg $$10 = $$0.b($$4);
                     if ($$6.C_().a(100) == 0 && $$6.aj() == $$9.a() && $$9.b().a($$7.dt(), 4.0) && $$10.d($$0xxx -> bwm.bD.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bwm.bD.equals($$1xx.aq()) && $$1xx.g($$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bze($$3xx, true));
                           $$1.a(new cgh(new bze($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
