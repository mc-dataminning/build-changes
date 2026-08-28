import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bzl {
   public static bxz<cpi> a() {
      return cbl.a(
         (Function<cbl.b<cpi>, ? extends App<cbl.c<cpi>, cbo<cpi>>>)($$0 -> $$0.group($$0.b(cfj.c), $$0.b(cfj.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jp $$6 = $$0.b($$1);
                        $$3.z()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bwf>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cpi && $$1xxx != $$4)
                                    .map($$0xxxx -> (cpi)$$0xxxx)
                                    .filter(bwf::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bzl::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cpi a(cpi $$0, cpi $$1) {
      cpi $$2;
      cpi $$3;
      if ($$0.x() > $$1.x()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cfj.c);
      return $$2;
   }

   private static boolean a(jp $$0, jq<chm> $$1, cpi $$2) {
      Optional<jp> $$3 = $$2.eb().c(cfj.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gw().b());
   }

   private static boolean a(jq<chm> $$0, cpl $$1) {
      return $$1.b().test($$0);
   }
}
