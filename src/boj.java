import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class boj {
   public static bmy<cdh> a() {
      return bqj.a(
         (Function<bqj.b<cdh>, ? extends App<bqj.c<cdh>, bqm<cdh>>>)($$0 -> $$0.group($$0.b(buh.c), $$0.b(buh.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ia $$6 = $$0.b($$1);
                        $$3.x()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<blg>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cdh && $$1xxx != $$4)
                                    .map($$0xxxx -> (cdh)$$0xxxx)
                                    .filter(blg::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, boj::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cdh a(cdh $$0, cdh $$1) {
      cdh $$2;
      cdh $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dP().b(buh.c);
      return $$2;
   }

   private static boolean a(ia $$0, ib<bwi> $$1, cdh $$2) {
      Optional<ia> $$3 = $$2.dP().c(buh.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gq().b());
   }

   private static boolean a(ib<bwi> $$0, cdk $$1) {
      return $$1.b().test($$0);
   }
}
