import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cay {
   public static bzm<crj> a() {
      return ccy.a(
         (Function<ccy.b<crj>, ? extends App<ccy.c<crj>, cdb<crj>>>)($$0 -> $$0.group($$0.b(cgw.c), $$0.b(cgw.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        je $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bxu>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof crj && $$1xxx != $$4)
                                    .map($$0xxxx -> (crj)$$0xxxx)
                                    .filter(bxu::bJ)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, cay::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static crj a(crj $$0, crj $$1) {
      crj $$2;
      crj $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ec().b(cgw.c);
      return $$2;
   }

   private static boolean a(je $$0, jf<ciz> $$1, crj $$2) {
      Optional<je> $$3 = $$2.ec().c(cgw.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gC().b());
   }

   private static boolean a(jf<ciz> $$0, jf<crm> $$1) {
      return $$1.a().b().test($$0);
   }
}
