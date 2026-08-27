import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class buj {
   public static bsx<cjy> a() {
      return bwj.a(
         (Function<bwj.b<cjy>, ? extends App<bwj.c<cjy>, bwm<cjy>>>)($$0 -> $$0.group($$0.b(cah.c), $$0.b(cah.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        iu $$6 = $$0.b($$1);
                        $$3.y()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bre>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cjy && $$1xxx != $$4)
                                    .map($$0xxxx -> (cjy)$$0xxxx)
                                    .filter(bre::bB)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, buj::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cjy a(cjy $$0, cjy $$1) {
      cjy $$2;
      cjy $$3;
      if ($$0.u() > $$1.u()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dQ().b(cah.c);
      return $$2;
   }

   private static boolean a(iu $$0, iv<cck> $$1, cjy $$2) {
      Optional<iu> $$3 = $$2.dQ().c(cah.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gA().b());
   }

   private static boolean a(iv<cck> $$0, ckb $$1) {
      return $$1.b().test($$0);
   }
}
