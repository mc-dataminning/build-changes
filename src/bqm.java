import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqm {
   private static final float a = 0.3F;

   public static bpm<bmk> a() {
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$0 -> $$0.group($$0.a(bvm.m), $$0.a(bvm.n), $$0.b(bvm.e), $$0.b(bvm.h), $$0.c(bvm.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ig $$9 = $$0.b($$3);
                     bvo $$10 = $$0.b($$4);
                     if ($$6.F_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dk(), 4.0) && $$10.d($$0xxx -> bly.bg.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bly.bg.equals($$1xx.ai()) && $$1xx.f((blu)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bom($$3xx, true));
                           $$1.a(new bvp(new bom($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
