import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bmp {
   public static ble<cbn> a() {
      return bop.a(
         (Function<bop.b<cbn>, ? extends App<bop.c<cbn>, bos<cbn>>>)($$0 -> $$0.group($$0.b(bsn.c), $$0.b(bsn.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        hd $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bjm>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cbn && $$1xxx != $$4)
                                    .map($$0xxxx -> (cbn)$$0xxxx)
                                    .filter(bjm::bv)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bmp::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cbn a(cbn $$0, cbn $$1) {
      cbn $$2;
      cbn $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dN().b(bsn.c);
      return $$2;
   }

   private static boolean a(hd $$0, he<buo> $$1, cbn $$2) {
      Optional<hd> $$3 = $$2.dN().c(bsn.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gp().b());
   }

   private static boolean a(he<buo> $$0, cbq $$1) {
      return $$1.b().test($$0);
   }
}
