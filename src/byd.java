import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byd {
   public static bus<clu> a(float $$0) {
      return bye.a(
         (Function<bye.b<clu>, ? extends App<bye.c<clu>, byh<clu>>>)($$1 -> $$1.group($$1.b(ccc.d), $$1.c(ccc.c), $$1.b(ccc.g), $$1.a(ccc.m), $$1.a(ccc.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gy().b() != clx.b) {
                           return false;
                        } else {
                           ja $$9 = $$1.<ji>b($$2).b();
                           Optional<jj<cef>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bsy>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof clu && $$1xxx != $$7)
                                 .map($$0xxxx -> (clu)$$0xxxx)
                                 .filter(bsy::bD)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dT().c(ccc.c).isEmpty()) {
                                       but.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dT().a(ccc.d, ji.a($$6x.af(), $$9));
                                       afy.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jj<cef> $$0, clu $$1, ja $$2) {
      boolean $$3 = $$1.dT().c(ccc.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ji> $$4 = $$1.dT().c(ccc.c);
         clx $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bth $$0, ja $$1, cef $$2) {
      eop $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
