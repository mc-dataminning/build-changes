import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bym {
   public static bxa<coi> a() {
      return cam.a(
         (Function<cam.b<coi>, ? extends App<cam.c<coi>, cap<coi>>>)($$0 -> $$0.group($$0.b(cek.c), $$0.b(cek.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jq $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bvg>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof coi && $$1xxx != $$4)
                                    .map($$0xxxx -> (coi)$$0xxxx)
                                    .filter(bvg::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bym::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static coi a(coi $$0, coi $$1) {
      coi $$2;
      coi $$3;
      if ($$0.x() > $$1.x()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ec().b(cek.c);
      return $$2;
   }

   private static boolean a(jq $$0, jr<cgn> $$1, coi $$2) {
      Optional<jq> $$3 = $$2.ec().c(cek.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gz().b());
   }

   private static boolean a(jr<cgn> $$0, col $$1) {
      return $$1.b().test($$0);
   }
}
