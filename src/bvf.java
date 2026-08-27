import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bvf {
   public static btt<cku> a() {
      return bxf.a(
         (Function<bxf.b<cku>, ? extends App<bxf.c<cku>, bxi<cku>>>)($$0 -> $$0.group($$0.b(cbd.c), $$0.b(cbd.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        iv $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bsa>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cku && $$1xxx != $$4)
                                    .map($$0xxxx -> (cku)$$0xxxx)
                                    .filter(bsa::bB)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bvf::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cku a(cku $$0, cku $$1) {
      cku $$2;
      cku $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dQ().b(cbd.c);
      return $$2;
   }

   private static boolean a(iv $$0, iw<cdg> $$1, cku $$2) {
      Optional<iv> $$3 = $$2.dQ().c(cbd.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gA().b());
   }

   private static boolean a(iw<cdg> $$0, ckx $$1) {
      return $$1.b().test($$0);
   }
}
