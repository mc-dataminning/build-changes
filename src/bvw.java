import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bvw {
   public static buk<cll> a() {
      return bxw.a(
         (Function<bxw.b<cll>, ? extends App<bxw.c<cll>, bxz<cll>>>)($$0 -> $$0.group($$0.b(cbu.c), $$0.b(cbu.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        iw $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bsq>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cll && $$1xxx != $$4)
                                    .map($$0xxxx -> (cll)$$0xxxx)
                                    .filter(bsq::bD)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bvw::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cll a(cll $$0, cll $$1) {
      cll $$2;
      cll $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dS().b(cbu.c);
      return $$2;
   }

   private static boolean a(iw $$0, ix<cdx> $$1, cll $$2) {
      Optional<iw> $$3 = $$2.dS().c(cbu.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gA().b());
   }

   private static boolean a(ix<cdx> $$0, clo $$1) {
      return $$1.b().test($$0);
   }
}
