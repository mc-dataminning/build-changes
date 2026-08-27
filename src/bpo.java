import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bpo {
   public static boc<ceu> a() {
      return bro.a(
         (Function<bro.b<ceu>, ? extends App<bro.c<ceu>, brr<ceu>>>)($$0 -> $$0.group($$0.b(bvm.c), $$0.b(bvm.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ig $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bmk>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof ceu && $$1xxx != $$4)
                                    .map($$0xxxx -> (ceu)$$0xxxx)
                                    .filter(bmk::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bpo::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static ceu a(ceu $$0, ceu $$1) {
      ceu $$2;
      ceu $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dO().b(bvm.c);
      return $$2;
   }

   private static boolean a(ig $$0, ih<bxo> $$1, ceu $$2) {
      Optional<ig> $$3 = $$2.dO().c(bvm.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gp().b());
   }

   private static boolean a(ih<bxo> $$0, cex $$1) {
      return $$1.b().test($$0);
   }
}
