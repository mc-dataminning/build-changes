import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bzm {
   public static bya<cpj> a() {
      return cbm.a(
         (Function<cbm.b<cpj>, ? extends App<cbm.c<cpj>, cbp<cpj>>>)($$0 -> $$0.group($$0.b(cfk.c), $$0.b(cfk.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jp $$6 = $$0.b($$1);
                        $$3.z()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bwg>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cpj && $$1xxx != $$4)
                                    .map($$0xxxx -> (cpj)$$0xxxx)
                                    .filter(bwg::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bzm::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cpj a(cpj $$0, cpj $$1) {
      cpj $$2;
      cpj $$3;
      if ($$0.x() > $$1.x()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ec().b(cfk.c);
      return $$2;
   }

   private static boolean a(jp $$0, jq<chn> $$1, cpj $$2) {
      Optional<jp> $$3 = $$2.ec().c(cfk.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(jq<chn> $$0, cpm $$1) {
      return $$1.b().test($$0);
   }
}
