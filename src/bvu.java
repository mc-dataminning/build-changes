import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bvu {
   public static bui<clj> a() {
      return bxu.a(
         (Function<bxu.b<clj>, ? extends App<bxu.c<clj>, bxx<clj>>>)($$0 -> $$0.group($$0.b(cbs.c), $$0.b(cbs.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        iw $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bso>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof clj && $$1xxx != $$4)
                                    .map($$0xxxx -> (clj)$$0xxxx)
                                    .filter(bso::bD)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bvu::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static clj a(clj $$0, clj $$1) {
      clj $$2;
      clj $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dS().b(cbs.c);
      return $$2;
   }

   private static boolean a(iw $$0, ix<cdv> $$1, clj $$2) {
      Optional<iw> $$3 = $$2.dS().c(cbs.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gA().b());
   }

   private static boolean a(ix<cdv> $$0, clm $$1) {
      return $$1.b().test($$0);
   }
}
