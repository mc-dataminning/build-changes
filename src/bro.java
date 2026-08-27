import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bro {
   public static bod<cev> a(float $$0) {
      return brp.a(
         (Function<brp.b<cev>, ? extends App<brp.c<cev>, brs<cev>>>)($$1 -> $$1.group($$1.b(bvn.d), $$1.c(bvn.c), $$1.b(bvn.g), $$1.a(bvn.m), $$1.a(bvn.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gp().b() != cey.b) {
                           return false;
                        } else {
                           hx $$9 = $$1.<ig>b($$2).b();
                           Optional<ih<bxp>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bml>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cev && $$1xxx != $$7)
                                 .map($$0xxxx -> (cev)$$0xxxx)
                                 .filter(bml::bx)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dO().c(bvn.c).isEmpty()) {
                                       boe.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dO().a(bvn.d, ig.a($$6x.ae(), $$9));
                                       adi.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ih<bxp> $$0, cev $$1, hx $$2) {
      boolean $$3 = $$1.dO().c(bvn.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ig> $$4 = $$1.dO().c(bvn.c);
         cey $$5 = $$1.gp().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bmu $$0, hx $$1, bxp $$2) {
      efg $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
