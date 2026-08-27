import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class brr {
   public static bog<cfd> a(float $$0) {
      return brs.a(
         (Function<brs.b<cfd>, ? extends App<brs.c<cfd>, brv<cfd>>>)($$1 -> $$1.group($$1.b(bvq.d), $$1.c(bvq.c), $$1.b(bvq.g), $$1.a(bvq.m), $$1.a(bvq.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gq().b() != cfg.b) {
                           return false;
                        } else {
                           hx $$9 = $$1.<ig>b($$2).b();
                           Optional<ih<bxt>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bmo>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cfd && $$1xxx != $$7)
                                 .map($$0xxxx -> (cfd)$$0xxxx)
                                 .filter(bmo::bx)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dN().c(bvq.c).isEmpty()) {
                                       boh.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dN().a(bvq.d, ig.a($$6x.ae(), $$9));
                                       adj.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ih<bxt> $$0, cfd $$1, hx $$2) {
      boolean $$3 = $$1.dN().c(bvq.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ig> $$4 = $$1.dN().c(bvq.c);
         cfg $$5 = $$1.gq().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bmx $$0, hx $$1, bxt $$2) {
      efo $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
