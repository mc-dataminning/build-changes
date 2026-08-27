import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class brn {
   public static boc<ceu> a(float $$0) {
      return bro.a(
         (Function<bro.b<ceu>, ? extends App<bro.c<ceu>, brr<ceu>>>)($$1 -> $$1.group($$1.b(bvm.d), $$1.c(bvm.c), $$1.b(bvm.g), $$1.a(bvm.m), $$1.a(bvm.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gp().b() != cex.b) {
                           return false;
                        } else {
                           hx $$9 = $$1.<ig>b($$2).b();
                           Optional<ih<bxo>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bmk>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof ceu && $$1xxx != $$7)
                                 .map($$0xxxx -> (ceu)$$0xxxx)
                                 .filter(bmk::bx)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dO().c(bvm.c).isEmpty()) {
                                       bod.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dO().a(bvm.d, ig.a($$6x.ae(), $$9));
                                       adi.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ih<bxo> $$0, ceu $$1, hx $$2) {
      boolean $$3 = $$1.dO().c(bvm.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ig> $$4 = $$1.dO().c(bvm.c);
         cex $$5 = $$1.gp().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bmt $$0, hx $$1, bxo $$2) {
      eff $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
