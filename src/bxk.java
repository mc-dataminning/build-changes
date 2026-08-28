import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bxk {
   public static bvy<cnc> a() {
      return bzk.a(
         (Function<bzk.b<cnc>, ? extends App<bzk.c<cnc>, bzn<cnc>>>)($$0 -> $$0.group($$0.b(cdi.c), $$0.b(cdi.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jm $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<buf>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cnc && $$1xxx != $$4)
                                    .map($$0xxxx -> (cnc)$$0xxxx)
                                    .filter(buf::bI)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bxk::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cnc a(cnc $$0, cnc $$1) {
      cnc $$2;
      cnc $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dX().b(cdi.c);
      return $$2;
   }

   private static boolean a(jm $$0, jn<cfl> $$1, cnc $$2) {
      Optional<jm> $$3 = $$2.dX().c(cdi.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(jn<cfl> $$0, cnf $$1) {
      return $$1.b().test($$0);
   }
}
