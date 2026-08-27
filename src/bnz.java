import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bnz {
   public static bkp<cay> a(float $$0) {
      return boa.a(
         (Function<boa.b<cay>, ? extends App<boa.c<cay>, bod<cay>>>)($$1 -> $$1.group($$1.b(bry.d), $$1.c(bry.c), $$1.b(bry.g), $$1.a(bry.m), $$1.a(bry.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.i_()) {
                           return false;
                        } else if ($$7.gk().b() != cbb.b) {
                           return false;
                        } else {
                           gv $$9 = $$1.<he>b($$2).b();
                           Optional<hf<btz>> $$10 = $$6x.w().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<biw>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cay && $$1xxx != $$7)
                                 .map($$0xxxx -> (cay)$$0xxxx)
                                 .filter(biw::bv)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dM().c(bry.c).isEmpty()) {
                                       bkq.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dM().a(bry.d, he.a($$6x.ac(), $$9));
                                       aau.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(hf<btz> $$0, cay $$1, gv $$2) {
      boolean $$3 = $$1.dM().c(bry.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<he> $$4 = $$1.dM().c(bry.c);
         cbb $$5 = $$1.gk().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bjf $$0, gv $$1, btz $$2) {
      eaq $$3 = $$0.H().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
