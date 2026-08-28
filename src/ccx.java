import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ccx {
   public static bzm<crj> a(float $$0) {
      return ccy.a(
         (Function<ccy.b<crj>, ? extends App<ccy.c<crj>, cdb<crj>>>)($$1 -> $$1.group($$1.b(cgw.d), $$1.c(cgw.c), $$1.b(cgw.g), $$1.a(cgw.n), $$1.a(cgw.o))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if (!$$7.gC().b().a(crm.b)) {
                           return false;
                        } else {
                           iv $$9 = $$1.<je>b($$2).b();
                           Optional<jf<ciz>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bxu>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof crj && $$1xxx != $$7)
                                 .map($$0xxxx -> (crj)$$0xxxx)
                                 .filter(bxu::bJ)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ec().c(cgw.c).isEmpty()) {
                                       bzn.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ec().a(cgw.d, je.a($$6x.aj(), $$9));
                                       ago.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jf<ciz> $$0, crj $$1, iv $$2) {
      boolean $$3 = $$1.ec().c(cgw.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<je> $$4 = $$1.ec().c(cgw.c);
         jf<crm> $$5 = $$1.gC().b();
         if ($$5.a().b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(byc $$0, iv $$1, ciz $$2) {
      eyc $$3 = $$0.O().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
