import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byw {
   public static bvl<cmm> a(float $$0) {
      return byx.a(
         (Function<byx.b<cmm>, ? extends App<byx.c<cmm>, bza<cmm>>>)($$1 -> $$1.group($$1.b(ccv.d), $$1.c(ccv.c), $$1.b(ccv.g), $$1.a(ccv.m), $$1.a(ccv.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gB().b() != cmp.b) {
                           return false;
                        } else {
                           iz $$9 = $$1.<jh>b($$2).b();
                           Optional<ji<cey>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<btr>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cmm && $$1xxx != $$7)
                                 .map($$0xxxx -> (cmm)$$0xxxx)
                                 .filter(btr::bD)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dS().c(ccv.c).isEmpty()) {
                                       bvm.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dS().a(ccv.d, jh.a($$6x.af(), $$9));
                                       agt.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ji<cey> $$0, cmm $$1, iz $$2) {
      boolean $$3 = $$1.dS().c(ccv.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jh> $$4 = $$1.dS().c(ccv.c);
         cmp $$5 = $$1.gB().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bua $$0, iz $$1, cey $$2) {
      eol $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
