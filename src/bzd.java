import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bzd {
   public static bxr<cpa> a() {
      return cbd.a(
         (Function<cbd.b<cpa>, ? extends App<cbd.c<cpa>, cbg<cpa>>>)($$0 -> $$0.group($$0.b(cfb.c), $$0.b(cfb.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jp $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bvx>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cpa && $$1xxx != $$4)
                                    .map($$0xxxx -> (cpa)$$0xxxx)
                                    .filter(bvx::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bzd::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cpa a(cpa $$0, cpa $$1) {
      cpa $$2;
      cpa $$3;
      if ($$0.x() > $$1.x()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ec().b(cfb.c);
      return $$2;
   }

   private static boolean a(jp $$0, jq<che> $$1, cpa $$2) {
      Optional<jp> $$3 = $$2.ec().c(cfb.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(jq<che> $$0, cpd $$1) {
      return $$1.b().test($$0);
   }
}
