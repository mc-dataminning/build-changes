import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bps {
   public static bog<cfd> a() {
      return brs.a(
         (Function<brs.b<cfd>, ? extends App<brs.c<cfd>, brv<cfd>>>)($$0 -> $$0.group($$0.b(bvq.c), $$0.b(bvq.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ig $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bmo>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cfd && $$1xxx != $$4)
                                    .map($$0xxxx -> (cfd)$$0xxxx)
                                    .filter(bmo::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bps::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cfd a(cfd $$0, cfd $$1) {
      cfd $$2;
      cfd $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dN().b(bvq.c);
      return $$2;
   }

   private static boolean a(ig $$0, ih<bxt> $$1, cfd $$2) {
      Optional<ig> $$3 = $$2.dN().c(bvq.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gq().b());
   }

   private static boolean a(ih<bxt> $$0, cfg $$1) {
      return $$1.b().test($$0);
   }
}
