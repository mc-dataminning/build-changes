import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class btt {
   public static bsh<cjg> a() {
      return bvt.a(
         (Function<bvt.b<cjg>, ? extends App<bvt.c<cjg>, bvw<cjg>>>)($$0 -> $$0.group($$0.b(bzr.c), $$0.b(bzr.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ik $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bqo>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cjg && $$1xxx != $$4)
                                    .map($$0xxxx -> (cjg)$$0xxxx)
                                    .filter(bqo::bA)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, btt::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cjg a(cjg $$0, cjg $$1) {
      cjg $$2;
      cjg $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dP().b(bzr.c);
      return $$2;
   }

   private static boolean a(ik $$0, il<cbu> $$1, cjg $$2) {
      Optional<ik> $$3 = $$2.dP().c(bzr.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(il<cbu> $$0, cjj $$1) {
      return $$1.b().test($$0);
   }
}
