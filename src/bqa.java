import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bqa {
   public static bmq<ccz> a(float $$0) {
      return bqb.a(
         (Function<bqb.b<ccz>, ? extends App<bqb.c<ccz>, bqe<ccz>>>)($$1 -> $$1.group($$1.b(btz.d), $$1.c(btz.c), $$1.b(btz.g), $$1.a(btz.m), $$1.a(btz.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if ($$7.gp().b() != cdc.b) {
                           return false;
                        } else {
                           ht $$9 = $$1.<ia>b($$2).b();
                           Optional<ib<bwa>> $$10 = $$6x.w().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bky>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof ccz && $$1xxx != $$7)
                                 .map($$0xxxx -> (ccz)$$0xxxx)
                                 .filter(bky::bv)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dN().c(btz.c).isEmpty()) {
                                       bmr.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dN().a(btz.d, ia.a($$6x.ac(), $$9));
                                       aci.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ib<bwa> $$0, ccz $$1, ht $$2) {
      boolean $$3 = $$1.dN().c(btz.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ia> $$4 = $$1.dN().c(btz.c);
         cdc $$5 = $$1.gp().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(blh $$0, ht $$1, bwa $$2) {
      ecv $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
