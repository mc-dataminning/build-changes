import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cag {
   public static byu<cqk> a() {
      return ccg.a(
         (Function<ccg.b<cqk>, ? extends App<ccg.c<cqk>, ccj<cqk>>>)($$0 -> $$0.group($$0.b(cge.c), $$0.b(cge.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jd $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bxc>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cqk && $$1xxx != $$4)
                                    .map($$0xxxx -> (cqk)$$0xxxx)
                                    .filter(bxc::bK)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, cag::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cqk a(cqk $$0, cqk $$1) {
      cqk $$2;
      cqk $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cge.c);
      return $$2;
   }

   private static boolean a(jd $$0, je<cih> $$1, cqk $$2) {
      Optional<jd> $$3 = $$2.eb().c(cge.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(je<cih> $$0, je<cqn> $$1) {
      return $$1.a().b().test($$0);
   }
}
