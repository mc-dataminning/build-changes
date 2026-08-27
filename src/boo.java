import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class boo {
   public static bnd<cdm> a() {
      return bqo.a(
         (Function<bqo.b<cdm>, ? extends App<bqo.c<cdm>, bqr<cdm>>>)($$0 -> $$0.group($$0.b(bum.c), $$0.b(bum.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ie $$6 = $$0.b($$1);
                        $$3.x()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bll>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cdm && $$1xxx != $$4)
                                    .map($$0xxxx -> (cdm)$$0xxxx)
                                    .filter(bll::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, boo::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cdm a(cdm $$0, cdm $$1) {
      cdm $$2;
      cdm $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dP().b(bum.c);
      return $$2;
   }

   private static boolean a(ie $$0, ig<bwn> $$1, cdm $$2) {
      Optional<ie> $$3 = $$2.dP().c(bum.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gq().b());
   }

   private static boolean a(ig<bwn> $$0, cdp $$1) {
      return $$1.b().test($$0);
   }
}
