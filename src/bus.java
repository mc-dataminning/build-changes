import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bus {
   public static brh<cif> a(float $$0) {
      return but.a(
         (Function<but.b<cif>, ? extends App<but.c<cif>, buw<cif>>>)($$1 -> $$1.group($$1.b(byr.d), $$1.c(byr.c), $$1.b(byr.g), $$1.a(byr.m), $$1.a(byr.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gy().b() != cii.b) {
                           return false;
                        } else {
                           ib $$9 = $$1.<ik>b($$2).b();
                           Optional<il<cau>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bpo>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cif && $$1xxx != $$7)
                                 .map($$0xxxx -> (cif)$$0xxxx)
                                 .filter(bpo::bA)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dP().c(byr.c).isEmpty()) {
                                       bri.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dP().a(byr.d, ik.a($$6x.ad(), $$9));
                                       aew.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(il<cau> $$0, cif $$1, ib $$2) {
      boolean $$3 = $$1.dP().c(byr.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ik> $$4 = $$1.dP().c(byr.c);
         cii $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bpw $$0, ib $$1, cau $$2) {
      ejc $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
