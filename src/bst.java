import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bst {
   public static brh<cif> a() {
      return but.a(
         (Function<but.b<cif>, ? extends App<but.c<cif>, buw<cif>>>)($$0 -> $$0.group($$0.b(byr.c), $$0.b(byr.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ik $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bpo>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cif && $$1xxx != $$4)
                                    .map($$0xxxx -> (cif)$$0xxxx)
                                    .filter(bpo::bA)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bst::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cif a(cif $$0, cif $$1) {
      cif $$2;
      cif $$3;
      if ($$0.s() > $$1.s()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dP().b(byr.c);
      return $$2;
   }

   private static boolean a(ik $$0, il<cau> $$1, cif $$2) {
      Optional<ik> $$3 = $$2.dP().c(byr.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(il<cau> $$0, cii $$1) {
      return $$1.b().test($$0);
   }
}
