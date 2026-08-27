import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bub {
   public static bqq<chn> a(float $$0) {
      return buc.a(
         (Function<buc.b<chn>, ? extends App<buc.c<chn>, buf<chn>>>)($$1 -> $$1.group($$1.b(bya.d), $$1.c(bya.c), $$1.b(bya.g), $$1.a(bya.m), $$1.a(bya.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gw().b() != chq.b) {
                           return false;
                        } else {
                           ib $$9 = $$1.<ik>b($$2).b();
                           Optional<il<cad>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<box>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof chn && $$1xxx != $$7)
                                 .map($$0xxxx -> (chn)$$0xxxx)
                                 .filter(box::bx)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dM().c(bya.c).isEmpty()) {
                                       bqr.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dM().a(bya.d, ik.a($$6x.ad(), $$9));
                                       aes.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(il<cad> $$0, chn $$1, ib $$2) {
      boolean $$3 = $$1.dM().c(bya.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ik> $$4 = $$1.dM().c(bya.c);
         chq $$5 = $$1.gw().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bpf $$0, ib $$1, cad $$2) {
      eig $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
