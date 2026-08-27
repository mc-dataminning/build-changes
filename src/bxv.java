import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bxv {
   public static buk<cll> a(float $$0) {
      return bxw.a(
         (Function<bxw.b<cll>, ? extends App<bxw.c<cll>, bxz<cll>>>)($$1 -> $$1.group($$1.b(cbu.d), $$1.c(cbu.c), $$1.b(cbu.g), $$1.a(cbu.m), $$1.a(cbu.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gA().b() != clo.b) {
                           return false;
                        } else {
                           io $$9 = $$1.<iw>b($$2).b();
                           Optional<ix<cdx>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bsq>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cll && $$1xxx != $$7)
                                 .map($$0xxxx -> (cll)$$0xxxx)
                                 .filter(bsq::bD)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dS().c(cbu.c).isEmpty()) {
                                       bul.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dS().a(cbu.d, iw.a($$6x.ae(), $$9));
                                       agb.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ix<cdx> $$0, cll $$1, io $$2) {
      boolean $$3 = $$1.dS().c(cbu.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<iw> $$4 = $$1.dS().c(cbu.c);
         clo $$5 = $$1.gA().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bsz $$0, io $$1, cdx $$2) {
      enk $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
