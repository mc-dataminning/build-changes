import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bme {
   public static bkt<cbc> a() {
      return boe.a(
         (Function<boe.b<cbc>, ? extends App<boe.c<cbc>, boh<cbc>>>)($$0 -> $$0.group($$0.b(bsc.c), $$0.b(bsc.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        hf $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bjb>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cbc && $$1xxx != $$4)
                                    .map($$0xxxx -> (cbc)$$0xxxx)
                                    .filter(bjb::bv)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bme::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cbc a(cbc $$0, cbc $$1) {
      cbc $$2;
      cbc $$3;
      if ($$0.q() > $$1.q()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dM().b(bsc.c);
      return $$2;
   }

   private static boolean a(hf $$0, hg<bud> $$1, cbc $$2) {
      Optional<hf> $$3 = $$2.dM().c(bsc.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gl().b());
   }

   private static boolean a(hg<bud> $$0, cbf $$1) {
      return $$1.b().test($$0);
   }
}
