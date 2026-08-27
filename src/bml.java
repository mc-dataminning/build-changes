import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bml {
   public static bla<cbj> a() {
      return bol.a(
         (Function<bol.b<cbj>, ? extends App<bol.c<cbj>, boo<cbj>>>)($$0 -> $$0.group($$0.b(bsj.c), $$0.b(bsj.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        hf $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bji>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cbj && $$1xxx != $$4)
                                    .map($$0xxxx -> (cbj)$$0xxxx)
                                    .filter(bji::bv)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bml::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cbj a(cbj $$0, cbj $$1) {
      cbj $$2;
      cbj $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dN().b(bsj.c);
      return $$2;
   }

   private static boolean a(hf $$0, hg<buk> $$1, cbj $$2) {
      Optional<hf> $$3 = $$2.dN().c(bsj.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.go().b());
   }

   private static boolean a(hg<buk> $$0, cbm $$1) {
      return $$1.b().test($$0);
   }
}
