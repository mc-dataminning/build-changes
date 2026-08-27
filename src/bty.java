import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bty {
   public static bsm<cjn> a() {
      return bvy.a(
         (Function<bvy.b<cjn>, ? extends App<bvy.c<cjn>, bwb<cjn>>>)($$0 -> $$0.group($$0.b(bzw.c), $$0.b(bzw.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        im $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bqt>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cjn && $$1xxx != $$4)
                                    .map($$0xxxx -> (cjn)$$0xxxx)
                                    .filter(bqt::bA)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, bty::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cjn a(cjn $$0, cjn $$1) {
      cjn $$2;
      cjn $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dP().b(bzw.c);
      return $$2;
   }

   private static boolean a(im $$0, in<cbz> $$1, cjn $$2) {
      Optional<im> $$3 = $$2.dP().c(bzw.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gy().b());
   }

   private static boolean a(in<cbz> $$0, cjq $$1) {
      return $$1.b().test($$0);
   }
}
