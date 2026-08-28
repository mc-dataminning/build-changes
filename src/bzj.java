import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bzj {
   public static bvy<cnc> a(float $$0) {
      return bzk.a(
         (Function<bzk.b<cnc>, ? extends App<bzk.c<cnc>, bzn<cnc>>>)($$1 -> $$1.group($$1.b(cdi.d), $$1.c(cdi.c), $$1.b(cdi.g), $$1.a(cdi.m), $$1.a(cdi.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gy().b() != cnf.b) {
                           return false;
                        } else {
                           je $$9 = $$1.<jm>b($$2).b();
                           Optional<jn<cfl>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<buf>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cnc && $$1xxx != $$7)
                                 .map($$0xxxx -> (cnc)$$0xxxx)
                                 .filter(buf::bI)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dX().c(cdi.c).isEmpty()) {
                                       bvz.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dX().a(cdi.d, jm.a($$6x.ag(), $$9));
                                       agn.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jn<cfl> $$0, cnc $$1, je $$2) {
      boolean $$3 = $$1.dX().c(cdi.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jm> $$4 = $$1.dX().c(cdi.c);
         cnf $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bun $$0, je $$1, cfl $$2) {
      eqp $$3 = $$0.P().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
