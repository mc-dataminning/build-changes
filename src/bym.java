import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bym {
   public static bxa<coh> a() {
      return cam.a(
         (Function<cam.b<coh>, ? extends App<cam.c<coh>, cap<coh>>>)($$0 -> $$0.group($$0.b(cek.c), $$0.b(cek.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jq $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bvg>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof coh && $$1xxx != $$4)
                                    .map($$0xxxx -> (coh)$$0xxxx)
                                    .filter(bvg::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bym::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static coh a(coh $$0, coh $$1) {
      coh $$2;
      coh $$3;
      if ($$0.x() > $$1.x()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cek.c);
      return $$2;
   }

   private static boolean a(jq $$0, jr<cgn> $$1, coh $$2) {
      Optional<jq> $$3 = $$2.eb().c(cek.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gC().b());
   }

   private static boolean a(jr<cgn> $$0, cok $$1) {
      return $$1.b().test($$0);
   }
}
