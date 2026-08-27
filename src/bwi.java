import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bwi {
   public static bsx<cjy> a(float $$0) {
      return bwj.a(
         (Function<bwj.b<cjy>, ? extends App<bwj.c<cjy>, bwm<cjy>>>)($$1 -> $$1.group($$1.b(cah.d), $$1.c(cah.c), $$1.b(cah.g), $$1.a(cah.m), $$1.a(cah.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gA().b() != ckb.b) {
                           return false;
                        } else {
                           im $$9 = $$1.<iu>b($$2).b();
                           Optional<iv<cck>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bre>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cjy && $$1xxx != $$7)
                                 .map($$0xxxx -> (cjy)$$0xxxx)
                                 .filter(bre::bB)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dQ().c(cah.c).isEmpty()) {
                                       bsy.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dQ().a(cah.d, iu.a($$6x.ae(), $$9));
                                       afu.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(iv<cck> $$0, cjy $$1, im $$2) {
      boolean $$3 = $$1.dQ().c(cah.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<iu> $$4 = $$1.dQ().c(cah.c);
         ckb $$5 = $$1.gA().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(brm $$0, im $$1, cck $$2) {
      emf $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
