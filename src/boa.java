import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class boa {
   public static bkq<caz> a(float $$0) {
      return bob.a(
         (Function<bob.b<caz>, ? extends App<bob.c<caz>, boe<caz>>>)($$1 -> $$1.group($$1.b(brz.d), $$1.c(brz.c), $$1.b(brz.g), $$1.a(brz.m), $$1.a(brz.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.i_()) {
                           return false;
                        } else if ($$7.gl().b() != cbc.b) {
                           return false;
                        } else {
                           gu $$9 = $$1.<hd>b($$2).b();
                           Optional<he<bua>> $$10 = $$6x.w().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<biy>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof caz && $$1xxx != $$7)
                                 .map($$0xxxx -> (caz)$$0xxxx)
                                 .filter(biy::bv)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dM().c(brz.c).isEmpty()) {
                                       bkr.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dM().a(brz.d, hd.a($$6x.ac(), $$9));
                                       aav.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(he<bua> $$0, caz $$1, gu $$2) {
      boolean $$3 = $$1.dM().c(brz.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<hd> $$4 = $$1.dM().c(brz.c);
         cbc $$5 = $$1.gl().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bjh $$0, gu $$1, bua $$2) {
      ear $$3 = $$0.H().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
