import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class brn {
   public static bqb<cgy> a() {
      return btn.a(
         (Function<btn.b<cgy>, ? extends App<btn.c<cgy>, btq<cgy>>>)($$0 -> $$0.group($$0.b(bxl.c), $$0.b(bxl.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ii $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<boi>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cgy && $$1xxx != $$4)
                                    .map($$0xxxx -> (cgy)$$0xxxx)
                                    .filter(boi::bx)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, brn::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cgy a(cgy $$0, cgy $$1) {
      cgy $$2;
      cgy $$3;
      if ($$0.w() > $$1.w()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dO().b(bxl.c);
      return $$2;
   }

   private static boolean a(ii $$0, ij<bzo> $$1, cgy $$2) {
      Optional<ii> $$3 = $$2.dO().c(bxl.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gr().b());
   }

   private static boolean a(ij<bzo> $$0, chb $$1) {
      return $$1.b().test($$0);
   }
}
