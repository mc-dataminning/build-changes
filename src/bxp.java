import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bxp {
   public static bwd<cnh> a() {
      return bzp.a(
         (Function<bzp.b<cnh>, ? extends App<bzp.c<cnh>, bzs<cnh>>>)($$0 -> $$0.group($$0.b(cdn.c), $$0.b(cdn.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jm $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<buk>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cnh && $$1xxx != $$4)
                                    .map($$0xxxx -> (cnh)$$0xxxx)
                                    .filter(buk::bI)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bxp::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cnh a(cnh $$0, cnh $$1) {
      cnh $$2;
      cnh $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dX().b(cdn.c);
      return $$2;
   }

   private static boolean a(jm $$0, jn<cfq> $$1, cnh $$2) {
      Optional<jm> $$3 = $$2.dX().c(cdn.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gz().b());
   }

   private static boolean a(jn<cfq> $$0, cnk $$1) {
      return $$1.b().test($$0);
   }
}
