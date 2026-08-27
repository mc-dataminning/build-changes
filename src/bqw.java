import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqw {
   public static bnx<bmf> a(cwj $$0) {
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$1 -> $$1.group($$1.c(bvh.o), $$1.b(bvh.m), $$1.b(bvh.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aZ() && $$3x.aC()) {
                        hx $$5 = $$3x.dm().d();

                        for (ic $$6 : ic.c.a) {
                           hx $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ic.b).c() && $$2x.b_($$7).b(eel.c)) {
                              hx $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dja $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dnk.i, $$8, dnk.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, arm.jl, arn.e, 1.0F, 1.0F);
                                 $$3.b();
                                 return true;
                              }
                           }
                        }

                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
