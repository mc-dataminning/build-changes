import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bws {
   public static bvg<cmi> a() {
      return bys.a(
         (Function<bys.b<cmi>, ? extends App<bys.c<cmi>, byv<cmi>>>)($$0 -> $$0.group($$0.b(ccq.c), $$0.b(ccq.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jl $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<btl>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cmi && $$1xxx != $$4)
                                    .map($$0xxxx -> (cmi)$$0xxxx)
                                    .filter(btl::bE)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bws::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cmi a(cmi $$0, cmi $$1) {
      cmi $$2;
      cmi $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dU().b(ccq.c);
      return $$2;
   }

   private static boolean a(jl $$0, jm<cet> $$1, cmi $$2) {
      Optional<jl> $$3 = $$2.dU().c(ccq.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gx().b());
   }

   private static boolean a(jm<cet> $$0, cml $$1) {
      return $$1.b().test($$0);
   }
}
