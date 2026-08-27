import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class boz {
   public static bnn<cee> a() {
      return bqz.a(
         (Function<bqz.b<cee>, ? extends App<bqz.c<cee>, brc<cee>>>)($$0 -> $$0.group($$0.b(bux.c), $$0.b(bux.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        id $$6 = $$0.b($$1);
                        $$3.x()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<blv>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cee && $$1xxx != $$4)
                                    .map($$0xxxx -> (cee)$$0xxxx)
                                    .filter(blv::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, boz::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cee a(cee $$0, cee $$1) {
      cee $$2;
      cee $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dO().b(bux.c);
      return $$2;
   }

   private static boolean a(id $$0, ie<bwz> $$1, cee $$2) {
      Optional<id> $$3 = $$2.dO().c(bux.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gp().b());
   }

   private static boolean a(ie<bwz> $$0, ceh $$1) {
      return $$1.b().test($$0);
   }
}
