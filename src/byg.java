import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byg {
   public static bwu<cny> a() {
      return cag.a(
         (Function<cag.b<cny>, ? extends App<cag.c<cny>, caj<cny>>>)($$0 -> $$0.group($$0.b(cee.c), $$0.b(cee.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jp $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bva>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cny && $$1xxx != $$4)
                                    .map($$0xxxx -> (cny)$$0xxxx)
                                    .filter(bva::bM)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, byg::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cny a(cny $$0, cny $$1) {
      cny $$2;
      cny $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ed().b(cee.c);
      return $$2;
   }

   private static boolean a(jp $$0, jq<cgh> $$1, cny $$2) {
      Optional<jp> $$3 = $$2.ed().c(cee.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gE().b());
   }

   private static boolean a(jq<cgh> $$0, cob $$1) {
      return $$1.b().test($$0);
   }
}
