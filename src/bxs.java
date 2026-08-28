import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bxs {
   public static bwg<cnk> a() {
      return bzs.a(
         (Function<bzs.b<cnk>, ? extends App<bzs.c<cnk>, bzv<cnk>>>)($$0 -> $$0.group($$0.b(cdq.c), $$0.b(cdq.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jn $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bun>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cnk && $$1xxx != $$4)
                                    .map($$0xxxx -> (cnk)$$0xxxx)
                                    .filter(bun::bI)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bxs::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cnk a(cnk $$0, cnk $$1) {
      cnk $$2;
      cnk $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dY().b(cdq.c);
      return $$2;
   }

   private static boolean a(jn $$0, jo<cft> $$1, cnk $$2) {
      Optional<jn> $$3 = $$2.dY().c(cdq.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(jo<cft> $$0, cnn $$1) {
      return $$1.b().test($$0);
   }
}
