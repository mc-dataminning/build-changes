import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwv {
   public static bvj<cmk> a() {
      return byv.a(
         (Function<byv.b<cmk>, ? extends App<byv.c<cmk>, byy<cmk>>>)($$0 -> $$0.group($$0.b(cct.c), $$0.b(cct.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jh $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<btp>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cmk && $$1xxx != $$4)
                                    .map($$0xxxx -> (cmk)$$0xxxx)
                                    .filter(btp::bD)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bwv::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cmk a(cmk $$0, cmk $$1) {
      cmk $$2;
      cmk $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dS().b(cct.c);
      return $$2;
   }

   private static boolean a(jh $$0, ji<cew> $$1, cmk $$2) {
      Optional<jh> $$3 = $$2.dS().c(cct.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gB().b());
   }

   private static boolean a(ji<cew> $$0, cmn $$1) {
      return $$1.b().test($$0);
   }
}
