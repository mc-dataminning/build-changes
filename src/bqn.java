import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bqn {
   public static bnd<cdm> a(float $$0) {
      return bqo.a(
         (Function<bqo.b<cdm>, ? extends App<bqo.c<cdm>, bqr<cdm>>>)($$1 -> $$1.group($$1.b(bum.d), $$1.c(bum.c), $$1.b(bum.g), $$1.a(bum.m), $$1.a(bum.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gq().b() != cdp.b) {
                           return false;
                        } else {
                           hx $$9 = $$1.<ie>b($$2).b();
                           Optional<ig<bwn>> $$10 = $$6x.x().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bll>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cdm && $$1xxx != $$7)
                                 .map($$0xxxx -> (cdm)$$0xxxx)
                                 .filter(bll::bx)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dP().c(bum.c).isEmpty()) {
                                       bne.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dP().a(bum.d, ie.a($$6x.ad(), $$9));
                                       aco.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ig<bwn> $$0, cdm $$1, hx $$2) {
      boolean $$3 = $$1.dP().c(bum.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ie> $$4 = $$1.dP().c(bum.c);
         cdp $$5 = $$1.gq().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(blu $$0, hx $$1, bwn $$2) {
      edm $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
