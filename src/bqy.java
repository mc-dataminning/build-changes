import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bqy {
   public static bnn<cee> a(float $$0) {
      return bqz.a(
         (Function<bqz.b<cee>, ? extends App<bqz.c<cee>, brc<cee>>>)($$1 -> $$1.group($$1.b(bux.d), $$1.c(bux.c), $$1.b(bux.g), $$1.a(bux.m), $$1.a(bux.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gp().b() != ceh.b) {
                           return false;
                        } else {
                           hv $$9 = $$1.<id>b($$2).b();
                           Optional<ie<bwz>> $$10 = $$6x.x().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<blv>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cee && $$1xxx != $$7)
                                 .map($$0xxxx -> (cee)$$0xxxx)
                                 .filter(blv::bx)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dO().c(bux.c).isEmpty()) {
                                       bno.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dO().a(bux.d, id.a($$6x.ad(), $$9));
                                       acv.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ie<bwz> $$0, cee $$1, hv $$2) {
      boolean $$3 = $$1.dO().c(bux.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<id> $$4 = $$1.dO().c(bux.c);
         ceh $$5 = $$1.gp().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bme $$0, hv $$1, bwz $$2) {
      eeo $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
