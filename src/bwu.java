import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwu {
   public static bvi<cmj> a() {
      return byu.a(
         (Function<byu.b<cmj>, ? extends App<byu.c<cmj>, byx<cmj>>>)($$0 -> $$0.group($$0.b(ccs.c), $$0.b(ccs.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jh $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bto>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cmj && $$1xxx != $$4)
                                    .map($$0xxxx -> (cmj)$$0xxxx)
                                    .filter(bto::bD)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bwu::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cmj a(cmj $$0, cmj $$1) {
      cmj $$2;
      cmj $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dS().b(ccs.c);
      return $$2;
   }

   private static boolean a(jh $$0, ji<cev> $$1, cmj $$2) {
      Optional<jh> $$3 = $$2.dS().c(ccs.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gB().b());
   }

   private static boolean a(ji<cev> $$0, cmm $$1) {
      return $$1.b().test($$0);
   }
}
