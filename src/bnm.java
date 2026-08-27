import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bnm {
   public static bmb<cck> a() {
      return bpm.a(
         (Function<bpm.b<cck>, ? extends App<bpm.c<cck>, bpp<cck>>>)($$0 -> $$0.group($$0.b(btk.c), $$0.b(btk.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ia $$6 = $$0.b($$1);
                        $$3.w()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bkj>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cck && $$1xxx != $$4)
                                    .map($$0xxxx -> (cck)$$0xxxx)
                                    .filter(bkj::bv)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bnm::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cck a(cck $$0, cck $$1) {
      cck $$2;
      cck $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dN().b(btk.c);
      return $$2;
   }

   private static boolean a(ia $$0, ib<bvl> $$1, cck $$2) {
      Optional<ia> $$3 = $$2.dN().c(btk.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gp().b());
   }

   private static boolean a(ib<bvl> $$0, ccn $$1) {
      return $$1.b().test($$0);
   }
}
