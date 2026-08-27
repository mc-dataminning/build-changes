import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bqi {
   public static bmy<cdh> a(float $$0) {
      return bqj.a(
         (Function<bqj.b<cdh>, ? extends App<bqj.c<cdh>, bqm<cdh>>>)($$1 -> $$1.group($$1.b(buh.d), $$1.c(buh.c), $$1.b(buh.g), $$1.a(buh.m), $$1.a(buh.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if ($$7.gq().b() != cdk.b) {
                           return false;
                        } else {
                           ht $$9 = $$1.<ia>b($$2).b();
                           Optional<ib<bwi>> $$10 = $$6x.x().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<blg>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cdh && $$1xxx != $$7)
                                 .map($$0xxxx -> (cdh)$$0xxxx)
                                 .filter(blg::bx)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dP().c(buh.c).isEmpty()) {
                                       bmz.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dP().a(buh.d, ia.a($$6x.ad(), $$9));
                                       ack.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ib<bwi> $$0, cdh $$1, ht $$2) {
      boolean $$3 = $$1.dP().c(buh.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ia> $$4 = $$1.dP().c(buh.c);
         cdk $$5 = $$1.gq().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(blp $$0, ht $$1, bwi $$2) {
      edh $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
