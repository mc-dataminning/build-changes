import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bzv {
   public static byj<cpu> a() {
      return cbv.a(
         (Function<cbv.b<cpu>, ? extends App<cbv.c<cpu>, cby<cpu>>>)($$0 -> $$0.group($$0.b(cft.c), $$0.b(cft.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jr $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bwr>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cpu && $$1xxx != $$4)
                                    .map($$0xxxx -> (cpu)$$0xxxx)
                                    .filter(bwr::bK)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bzv::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cpu a(cpu $$0, cpu $$1) {
      cpu $$2;
      cpu $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cft.c);
      return $$2;
   }

   private static boolean a(jr $$0, js<chw> $$1, cpu $$2) {
      Optional<jr> $$3 = $$2.eb().c(cft.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(js<chw> $$0, js<cpx> $$1) {
      return $$1.a().b().test($$0);
   }
}
