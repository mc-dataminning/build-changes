import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class boo {
   public static ble<cbn> a(float $$0) {
      return bop.a(
         (Function<bop.b<cbn>, ? extends App<bop.c<cbn>, bos<cbn>>>)($$1 -> $$1.group($$1.b(bsn.d), $$1.c(bsn.c), $$1.b(bsn.g), $$1.a(bsn.m), $$1.a(bsn.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.m_()) {
                           return false;
                        } else if ($$7.gp().b() != cbq.b) {
                           return false;
                        } else {
                           gw $$9 = $$1.<hd>b($$2).b();
                           Optional<he<buo>> $$10 = $$6x.w().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bjm>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cbn && $$1xxx != $$7)
                                 .map($$0xxxx -> (cbn)$$0xxxx)
                                 .filter(bjm::bv)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dN().c(bsn.c).isEmpty()) {
                                       blf.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dN().a(bsn.d, hd.a($$6x.ac(), $$9));
                                       abc.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(he<buo> $$0, cbn $$1, gw $$2) {
      boolean $$3 = $$1.dN().c(bsn.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<hd> $$4 = $$1.dN().c(bsn.c);
         cbq $$5 = $$1.gp().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bjv $$0, gw $$1, buo $$2) {
      eav $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
