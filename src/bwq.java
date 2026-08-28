import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwq {
   public static bve<cmf> a() {
      return byq.a(
         (Function<byq.b<cmf>, ? extends App<byq.c<cmf>, byt<cmf>>>)($$0 -> $$0.group($$0.b(cco.c), $$0.b(cco.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jh $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<btk>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cmf && $$1xxx != $$4)
                                    .map($$0xxxx -> (cmf)$$0xxxx)
                                    .filter(btk::bD)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bwq::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cmf a(cmf $$0, cmf $$1) {
      cmf $$2;
      cmf $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dS().b(cco.c);
      return $$2;
   }

   private static boolean a(jh $$0, ji<cer> $$1, cmf $$2) {
      Optional<jh> $$3 = $$2.dS().c(cco.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gB().b());
   }

   private static boolean a(ji<cer> $$0, cmi $$1) {
      return $$1.b().test($$0);
   }
}
