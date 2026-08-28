import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cch {
   public static byw<cqo> a(float $$0) {
      return cci.a(
         (Function<cci.b<cqo>, ? extends App<cci.c<cqo>, ccl<cqo>>>)($$1 -> $$1.group($$1.b(cgg.d), $$1.c(cgg.c), $$1.b(cgg.g), $$1.a(cgg.n), $$1.a(cgg.o))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if (!$$7.gz().b().a(cqr.b)) {
                           return false;
                        } else {
                           iu $$9 = $$1.<jd>b($$2).b();
                           Optional<je<cij>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bxe>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cqo && $$1xxx != $$7)
                                 .map($$0xxxx -> (cqo)$$0xxxx)
                                 .filter(bxe::bK)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ec().c(cgg.c).isEmpty()) {
                                       byx.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ec().a(cgg.d, jd.a($$6x.aj(), $$9));
                                       agm.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(je<cij> $$0, cqo $$1, iu $$2) {
      boolean $$3 = $$1.ec().c(cgg.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jd> $$4 = $$1.ec().c(cgg.c);
         je<cqr> $$5 = $$1.gz().b();
         if ($$5.a().b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bxm $$0, iu $$1, cij $$2) {
      exc $$3 = $$0.O().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
