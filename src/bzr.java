import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bzr {
   public static bwg<cnk> a(float $$0) {
      return bzs.a(
         (Function<bzs.b<cnk>, ? extends App<bzs.c<cnk>, bzv<cnk>>>)($$1 -> $$1.group($$1.b(cdq.d), $$1.c(cdq.c), $$1.b(cdq.g), $$1.a(cdq.m), $$1.a(cdq.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gy().b() != cnn.b) {
                           return false;
                        } else {
                           jf $$9 = $$1.<jn>b($$2).b();
                           Optional<jo<cft>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bun>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cnk && $$1xxx != $$7)
                                 .map($$0xxxx -> (cnk)$$0xxxx)
                                 .filter(bun::bI)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dY().c(cdq.c).isEmpty()) {
                                       bwh.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dY().a(cdq.d, jn.a($$6x.ag(), $$9));
                                       ago.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jo<cft> $$0, cnk $$1, jf $$2) {
      boolean $$3 = $$1.dY().c(cdq.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jn> $$4 = $$1.dY().c(cdq.c);
         cnn $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(buv $$0, jf $$1, cft $$2) {
      erh $$3 = $$0.P().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
