import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byh {
   public static buw<cly> a(float $$0) {
      return byi.a(
         (Function<byi.b<cly>, ? extends App<byi.c<cly>, byl<cly>>>)($$1 -> $$1.group($$1.b(ccg.d), $$1.c(ccg.c), $$1.b(ccg.g), $$1.a(ccg.m), $$1.a(ccg.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gy().b() != cmb.b) {
                           return false;
                        } else {
                           ja $$9 = $$1.<ji>b($$2).b();
                           Optional<jj<cej>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<btc>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cly && $$1xxx != $$7)
                                 .map($$0xxxx -> (cly)$$0xxxx)
                                 .filter(btc::bF)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dV().c(ccg.c).isEmpty()) {
                                       bux.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dV().a(ccg.d, ji.a($$6x.af(), $$9));
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

   private static boolean a(jj<cej> $$0, cly $$1, ja $$2) {
      boolean $$3 = $$1.dV().c(ccg.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ji> $$4 = $$1.dV().c(ccg.c);
         cmb $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(btl $$0, ja $$1, cej $$2) {
      eox $$3 = $$0.J().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
