import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byk {
   public static bwy<coc> a() {
      return cak.a(
         (Function<cak.b<coc>, ? extends App<cak.c<coc>, can<coc>>>)($$0 -> $$0.group($$0.b(cei.c), $$0.b(cei.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jp $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bve>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof coc && $$1xxx != $$4)
                                    .map($$0xxxx -> (coc)$$0xxxx)
                                    .filter(bve::bN)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, byk::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static coc a(coc $$0, coc $$1) {
      coc $$2;
      coc $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ee().b(cei.c);
      return $$2;
   }

   private static boolean a(jp $$0, jq<cgl> $$1, coc $$2) {
      Optional<jp> $$3 = $$2.ee().c(cei.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gF().b());
   }

   private static boolean a(jq<cgl> $$0, cof $$1) {
      return $$1.b().test($$0);
   }
}
