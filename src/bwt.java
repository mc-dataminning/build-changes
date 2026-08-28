import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwt {
   public static bvh<cmi> a() {
      return byt.a(
         (Function<byt.b<cmi>, ? extends App<byt.c<cmi>, byw<cmi>>>)($$0 -> $$0.group($$0.b(ccr.c), $$0.b(ccr.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jh $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<btn>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cmi && $$1xxx != $$4)
                                    .map($$0xxxx -> (cmi)$$0xxxx)
                                    .filter(btn::bD)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bwt::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cmi a(cmi $$0, cmi $$1) {
      cmi $$2;
      cmi $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dS().b(ccr.c);
      return $$2;
   }

   private static boolean a(jh $$0, ji<ceu> $$1, cmi $$2) {
      Optional<jh> $$3 = $$2.dS().c(ccr.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gB().b());
   }

   private static boolean a(ji<ceu> $$0, cml $$1) {
      return $$1.b().test($$0);
   }
}
