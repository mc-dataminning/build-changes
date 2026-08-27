import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bvt {
   public static buh<cll> a() {
      return bxt.a(
         (Function<bxt.b<cll>, ? extends App<bxt.c<cll>, bxw<cll>>>)($$0 -> $$0.group($$0.b(cbr.c), $$0.b(cbr.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        iz $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bso>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cll && $$1xxx != $$4)
                                    .map($$0xxxx -> (cll)$$0xxxx)
                                    .filter(bso::bI)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bvt::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cll a(cll $$0, cll $$1) {
      cll $$2;
      cll $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dZ().b(cbr.c);
      return $$2;
   }

   private static boolean a(iz $$0, ja<cdu> $$1, cll $$2) {
      Optional<iz> $$3 = $$2.dZ().c(cbr.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gL().b());
   }

   private static boolean a(ja<cdu> $$0, clo $$1) {
      return $$1.b().test($$0);
   }
}
