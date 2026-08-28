import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cad {
   public static byr<cqe> a() {
      return ccd.a(
         (Function<ccd.b<cqe>, ? extends App<ccd.c<cqe>, ccg<cqe>>>)($$0 -> $$0.group($$0.b(cgb.c), $$0.b(cgb.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jd $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bwz>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cqe && $$1xxx != $$4)
                                    .map($$0xxxx -> (cqe)$$0xxxx)
                                    .filter(bwz::bK)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, cad::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cqe a(cqe $$0, cqe $$1) {
      cqe $$2;
      cqe $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cgb.c);
      return $$2;
   }

   private static boolean a(jd $$0, je<cie> $$1, cqe $$2) {
      Optional<jd> $$3 = $$2.eb().c(cgb.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(je<cie> $$0, je<cqh> $$1) {
      return $$1.a().b().test($$0);
   }
}
