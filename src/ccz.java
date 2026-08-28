import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ccz {
   public static bzo<crl> a(float $$0) {
      return cda.a(
         (Function<cda.b<crl>, ? extends App<cda.c<crl>, cdd<crl>>>)($$1 -> $$1.group($$1.b(cgy.d), $$1.c(cgy.c), $$1.b(cgy.g), $$1.a(cgy.n), $$1.a(cgy.o))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if (!$$7.gC().b().a(cro.b)) {
                           return false;
                        } else {
                           iw $$9 = $$1.<jf>b($$2).b();
                           Optional<jg<cjb>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bxw>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof crl && $$1xxx != $$7)
                                 .map($$0xxxx -> (crl)$$0xxxx)
                                 .filter(bxw::bJ)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ec().c(cgy.c).isEmpty()) {
                                       bzp.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ec().a(cgy.d, jf.a($$6x.aj(), $$9));
                                       agq.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jg<cjb> $$0, crl $$1, iw $$2) {
      boolean $$3 = $$1.ec().c(cgy.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jf> $$4 = $$1.ec().c(cgy.c);
         jg<cro> $$5 = $$1.gC().b();
         if ($$5.a().b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bye $$0, iw $$1, cjb $$2) {
      eye $$3 = $$0.O().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
