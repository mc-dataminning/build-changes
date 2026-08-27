import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bvs {
   public static bsh<cjg> a(float $$0) {
      return bvt.a(
         (Function<bvt.b<cjg>, ? extends App<bvt.c<cjg>, bvw<cjg>>>)($$1 -> $$1.group($$1.b(bzr.d), $$1.c(bzr.c), $$1.b(bzr.g), $$1.a(bzr.m), $$1.a(bzr.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gy().b() != cjj.b) {
                           return false;
                        } else {
                           ib $$9 = $$1.<ik>b($$2).b();
                           Optional<il<cbu>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bqo>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cjg && $$1xxx != $$7)
                                 .map($$0xxxx -> (cjg)$$0xxxx)
                                 .filter(bqo::bA)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dP().c(bzr.c).isEmpty()) {
                                       bsi.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dP().a(bzr.d, ik.a($$6x.ae(), $$9));
                                       afi.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(il<cbu> $$0, cjg $$1, ib $$2) {
      boolean $$3 = $$1.dP().c(bzr.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ik> $$4 = $$1.dP().c(bzr.c);
         cjj $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bqw $$0, ib $$1, cbu $$2) {
      elg $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
