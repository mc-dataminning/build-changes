import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bsu {
   public static bri<cih> a() {
      return buu.a(
         (Function<buu.b<cih>, ? extends App<buu.c<cih>, bux<cih>>>)($$0 -> $$0.group($$0.b(bys.c), $$0.b(bys.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ik $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bpp>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cih && $$1xxx != $$4)
                                    .map($$0xxxx -> (cih)$$0xxxx)
                                    .filter(bpp::bA)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bsu::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cih a(cih $$0, cih $$1) {
      cih $$2;
      cih $$3;
      if ($$0.s() > $$1.s()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dP().b(bys.c);
      return $$2;
   }

   private static boolean a(ik $$0, il<cav> $$1, cih $$2) {
      Optional<ik> $$3 = $$2.dP().c(bys.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(il<cav> $$0, cik $$1) {
      return $$1.b().test($$0);
   }
}
