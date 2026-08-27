import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bmc {
   public static bkr<cba> a() {
      return boc.a(
         (Function<boc.b<cba>, ? extends App<boc.c<cba>, bof<cba>>>)($$0 -> $$0.group($$0.b(bsa.c), $$0.b(bsa.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        hd $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<biy>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cba && $$1xxx != $$4)
                                    .map($$0xxxx -> (cba)$$0xxxx)
                                    .filter(biy::bv)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bmc::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cba a(cba $$0, cba $$1) {
      cba $$2;
      cba $$3;
      if ($$0.q() > $$1.q()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dM().b(bsa.c);
      return $$2;
   }

   private static boolean a(hd $$0, he<bub> $$1, cba $$2) {
      Optional<hd> $$3 = $$2.dM().c(bsa.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gk().b());
   }

   private static boolean a(he<bub> $$0, cbd $$1) {
      return $$1.b().test($$0);
   }
}
