import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class but {
   public static bri<cih> a(float $$0) {
      return buu.a(
         (Function<buu.b<cih>, ? extends App<buu.c<cih>, bux<cih>>>)($$1 -> $$1.group($$1.b(bys.d), $$1.c(bys.c), $$1.b(bys.g), $$1.a(bys.m), $$1.a(bys.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gy().b() != cik.b) {
                           return false;
                        } else {
                           ib $$9 = $$1.<ik>b($$2).b();
                           Optional<il<cav>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bpp>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cih && $$1xxx != $$7)
                                 .map($$0xxxx -> (cih)$$0xxxx)
                                 .filter(bpp::bA)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dP().c(bys.c).isEmpty()) {
                                       brj.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dP().a(bys.d, ik.a($$6x.ad(), $$9));
                                       aew.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(il<cav> $$0, cih $$1, ib $$2) {
      boolean $$3 = $$1.dP().c(bys.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ik> $$4 = $$1.dP().c(bys.c);
         cik $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bpx $$0, ib $$1, cav $$2) {
      ejd $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
