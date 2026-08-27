import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bxe {
   public static btt<cku> a(float $$0) {
      return bxf.a(
         (Function<bxf.b<cku>, ? extends App<bxf.c<cku>, bxi<cku>>>)($$1 -> $$1.group($$1.b(cbd.d), $$1.c(cbd.c), $$1.b(cbd.g), $$1.a(cbd.m), $$1.a(cbd.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gA().b() != ckx.b) {
                           return false;
                        } else {
                           in $$9 = $$1.<iv>b($$2).b();
                           Optional<iw<cdg>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bsa>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cku && $$1xxx != $$7)
                                 .map($$0xxxx -> (cku)$$0xxxx)
                                 .filter(bsa::bB)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dQ().c(cbd.c).isEmpty()) {
                                       btu.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dQ().a(cbd.d, iv.a($$6x.ae(), $$9));
                                       afw.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(iw<cdg> $$0, cku $$1, in $$2) {
      boolean $$3 = $$1.dQ().c(cbd.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<iv> $$4 = $$1.dQ().c(cbd.c);
         ckx $$5 = $$1.gA().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bsi $$0, in $$1, cdg $$2) {
      emo $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
