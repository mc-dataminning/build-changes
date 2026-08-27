import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bmb {
   public static bkq<caz> a() {
      return bob.a(
         (Function<bob.b<caz>, ? extends App<bob.c<caz>, boe<caz>>>)($$0 -> $$0.group($$0.b(brz.c), $$0.b(brz.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        hd $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<biy>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof caz && $$1xxx != $$4)
                                    .map($$0xxxx -> (caz)$$0xxxx)
                                    .filter(biy::bv)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bmb::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static caz a(caz $$0, caz $$1) {
      caz $$2;
      caz $$3;
      if ($$0.q() > $$1.q()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dM().b(brz.c);
      return $$2;
   }

   private static boolean a(hd $$0, he<bua> $$1, caz $$2) {
      Optional<hd> $$3 = $$2.dM().c(brz.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gl().b());
   }

   private static boolean a(he<bua> $$0, cbc $$1) {
      return $$1.b().test($$0);
   }
}
