import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bob {
   public static bmq<ccz> a() {
      return bqb.a(
         (Function<bqb.b<ccz>, ? extends App<bqb.c<ccz>, bqe<ccz>>>)($$0 -> $$0.group($$0.b(btz.c), $$0.b(btz.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ia $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bky>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof ccz && $$1xxx != $$4)
                                    .map($$0xxxx -> (ccz)$$0xxxx)
                                    .filter(bky::bv)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bob::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static ccz a(ccz $$0, ccz $$1) {
      ccz $$2;
      ccz $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dN().b(btz.c);
      return $$2;
   }

   private static boolean a(ia $$0, ib<bwa> $$1, ccz $$2) {
      Optional<ia> $$3 = $$2.dN().c(btz.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gp().b());
   }

   private static boolean a(ib<bwa> $$0, cdc $$1) {
      return $$1.b().test($$0);
   }
}
