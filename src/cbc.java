import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cbc {
   public static bxr<cpa> a(float $$0) {
      return cbd.a(
         (Function<cbd.b<cpa>, ? extends App<cbd.c<cpa>, cbg<cpa>>>)($$1 -> $$1.group($$1.b(cfb.d), $$1.c(cfb.c), $$1.b(cfb.g), $$1.a(cfb.m), $$1.a(cfb.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if ($$7.gy().b() != cpd.b) {
                           return false;
                        } else {
                           jh $$9 = $$1.<jp>b($$2).b();
                           Optional<jq<che>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bvx>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cpa && $$1xxx != $$7)
                                 .map($$0xxxx -> (cpa)$$0xxxx)
                                 .filter(bvx::bL)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ec().c(cfb.c).isEmpty()) {
                                       bxs.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ec().a(cfb.d, jp.a($$6x.ai(), $$9));
                                       agy.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jq<che> $$0, cpa $$1, jh $$2) {
      boolean $$3 = $$1.ec().c(cfb.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jp> $$4 = $$1.ec().c(cfb.c);
         cpd $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bwf $$0, jh $$1, che $$2) {
      eue $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
