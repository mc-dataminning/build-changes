import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byg {
   public static buv<clx> a(float $$0) {
      return byh.a(
         (Function<byh.b<clx>, ? extends App<byh.c<clx>, byk<clx>>>)($$1 -> $$1.group($$1.b(ccf.d), $$1.c(ccf.c), $$1.b(ccf.g), $$1.a(ccf.m), $$1.a(ccf.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gz().b() != cma.b) {
                           return false;
                        } else {
                           ja $$9 = $$1.<ji>b($$2).b();
                           Optional<jj<cei>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<btb>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof clx && $$1xxx != $$7)
                                 .map($$0xxxx -> (clx)$$0xxxx)
                                 .filter(btb::bE)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dU().c(ccf.c).isEmpty()) {
                                       buw.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dU().a(ccf.d, ji.a($$6x.af(), $$9));
                                       afy.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jj<cei> $$0, clx $$1, ja $$2) {
      boolean $$3 = $$1.dU().c(ccf.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ji> $$4 = $$1.dU().c(ccf.c);
         cma $$5 = $$1.gz().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(btk $$0, ja $$1, cei $$2) {
      eov $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
