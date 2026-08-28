import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cai {
   public static byw<cqo> a() {
      return cci.a(
         (Function<cci.b<cqo>, ? extends App<cci.c<cqo>, ccl<cqo>>>)($$0 -> $$0.group($$0.b(cgg.c), $$0.b(cgg.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jd $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bxe>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cqo && $$1xxx != $$4)
                                    .map($$0xxxx -> (cqo)$$0xxxx)
                                    .filter(bxe::bK)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, cai::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cqo a(cqo $$0, cqo $$1) {
      cqo $$2;
      cqo $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ec().b(cgg.c);
      return $$2;
   }

   private static boolean a(jd $$0, je<cij> $$1, cqo $$2) {
      Optional<jd> $$3 = $$2.ec().c(cgg.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gz().b());
   }

   private static boolean a(je<cij> $$0, je<cqr> $$1) {
      return $$1.a().b().test($$0);
   }
}
