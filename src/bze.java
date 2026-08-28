import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bze {
   public static bxs<cpd> a() {
      return cbe.a(
         (Function<cbe.b<cpd>, ? extends App<cbe.c<cpd>, cbh<cpd>>>)($$0 -> $$0.group($$0.b(cfc.c), $$0.b(cfc.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jq $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bvy>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cpd && $$1xxx != $$4)
                                    .map($$0xxxx -> (cpd)$$0xxxx)
                                    .filter(bvy::bJ)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bze::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cpd a(cpd $$0, cpd $$1) {
      cpd $$2;
      cpd $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ea().b(cfc.c);
      return $$2;
   }

   private static boolean a(jq $$0, jr<chf> $$1, cpd $$2) {
      Optional<jq> $$3 = $$2.ea().c(cfc.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gA().b());
   }

   private static boolean a(jr<chf> $$0, cpg $$1) {
      return $$1.b().test($$0);
   }
}
