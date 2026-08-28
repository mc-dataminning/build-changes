import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwe {
   public static bus<clu> a() {
      return bye.a(
         (Function<bye.b<clu>, ? extends App<bye.c<clu>, byh<clu>>>)($$0 -> $$0.group($$0.b(ccc.c), $$0.b(ccc.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ji $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bsy>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof clu && $$1xxx != $$4)
                                    .map($$0xxxx -> (clu)$$0xxxx)
                                    .filter(bsy::bD)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bwe::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static clu a(clu $$0, clu $$1) {
      clu $$2;
      clu $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dT().b(ccc.c);
      return $$2;
   }

   private static boolean a(ji $$0, jj<cef> $$1, clu $$2) {
      Optional<ji> $$3 = $$2.dT().c(ccc.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(jj<cef> $$0, clx $$1) {
      return $$1.b().test($$0);
   }
}
