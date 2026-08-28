import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwu {
   public static bvi<cmk> a() {
      return byu.a(
         (Function<byu.b<cmk>, ? extends App<byu.c<cmk>, byx<cmk>>>)($$0 -> $$0.group($$0.b(ccs.c), $$0.b(ccs.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jl $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<btn>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cmk && $$1xxx != $$4)
                                    .map($$0xxxx -> (cmk)$$0xxxx)
                                    .filter(btn::bE)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bwu::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cmk a(cmk $$0, cmk $$1) {
      cmk $$2;
      cmk $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dU().b(ccs.c);
      return $$2;
   }

   private static boolean a(jl $$0, jm<cev> $$1, cmk $$2) {
      Optional<jl> $$3 = $$2.dU().c(ccs.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gw().b());
   }

   private static boolean a(jm<cev> $$0, cmn $$1) {
      return $$1.b().test($$0);
   }
}
