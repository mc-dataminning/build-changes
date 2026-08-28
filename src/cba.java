import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cba {
   public static bzo<crl> a() {
      return cda.a(
         (Function<cda.b<crl>, ? extends App<cda.c<crl>, cdd<crl>>>)($$0 -> $$0.group($$0.b(cgy.c), $$0.b(cgy.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jf $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bxw>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof crl && $$1xxx != $$4)
                                    .map($$0xxxx -> (crl)$$0xxxx)
                                    .filter(bxw::bJ)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, cba::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static crl a(crl $$0, crl $$1) {
      crl $$2;
      crl $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ec().b(cgy.c);
      return $$2;
   }

   private static boolean a(jf $$0, jg<cjb> $$1, crl $$2) {
      Optional<jf> $$3 = $$2.ec().c(cgy.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gC().b());
   }

   private static boolean a(jg<cjb> $$0, jg<cro> $$1) {
      return $$1.a().b().test($$0);
   }
}
