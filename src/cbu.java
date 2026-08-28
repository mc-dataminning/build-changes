import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cbu {
   public static byj<cpu> a(float $$0) {
      return cbv.a(
         (Function<cbv.b<cpu>, ? extends App<cbv.c<cpu>, cby<cpu>>>)($$1 -> $$1.group($$1.b(cft.d), $$1.c(cft.c), $$1.b(cft.g), $$1.a(cft.n), $$1.a(cft.o))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if (!$$7.gy().b().a(cpx.b)) {
                           return false;
                        } else {
                           jj $$9 = $$1.<jr>b($$2).b();
                           Optional<js<chw>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bwr>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cpu && $$1xxx != $$7)
                                 .map($$0xxxx -> (cpu)$$0xxxx)
                                 .filter(bwr::bK)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cft.c).isEmpty()) {
                                       byk.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cft.d, jr.a($$6x.aj(), $$9));
                                       agj.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(js<chw> $$0, cpu $$1, jj $$2) {
      boolean $$3 = $$1.eb().c(cft.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jr> $$4 = $$1.eb().c(cft.c);
         js<cpx> $$5 = $$1.gy().b();
         if ($$5.a().b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bwz $$0, jj $$1, chw $$2) {
      evh $$3 = $$0.O().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
