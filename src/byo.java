import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byo {
   public static bxc<coj> a() {
      return cao.a(
         (Function<cao.b<coj>, ? extends App<cao.c<coj>, car<coj>>>)($$0 -> $$0.group($$0.b(cem.c), $$0.b(cem.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jq $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bvi>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof coj && $$1xxx != $$4)
                                    .map($$0xxxx -> (coj)$$0xxxx)
                                    .filter(bvi::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, byo::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static coj a(coj $$0, coj $$1) {
      coj $$2;
      coj $$3;
      if ($$0.x() > $$1.x()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cem.c);
      return $$2;
   }

   private static boolean a(jq $$0, jr<cgp> $$1, coj $$2) {
      Optional<jq> $$3 = $$2.eb().c(cem.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gC().b());
   }

   private static boolean a(jr<cgp> $$0, com $$1) {
      return $$1.b().test($$0);
   }
}
