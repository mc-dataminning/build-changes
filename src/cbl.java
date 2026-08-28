import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cbl {
   public static bya<cpj> a(float $$0) {
      return cbm.a(
         (Function<cbm.b<cpj>, ? extends App<cbm.c<cpj>, cbp<cpj>>>)($$1 -> $$1.group($$1.b(cfk.d), $$1.c(cfk.c), $$1.b(cfk.g), $$1.a(cfk.m), $$1.a(cfk.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if ($$7.gy().b() != cpm.b) {
                           return false;
                        } else {
                           jh $$9 = $$1.<jp>b($$2).b();
                           Optional<jq<chn>> $$10 = $$6x.z().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bwg>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cpj && $$1xxx != $$7)
                                 .map($$0xxxx -> (cpj)$$0xxxx)
                                 .filter(bwg::bL)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ec().c(cfk.c).isEmpty()) {
                                       byb.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ec().a(cfk.d, jp.a($$6x.ah(), $$9));
                                       ahj.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jq<chn> $$0, cpj $$1, jh $$2) {
      boolean $$3 = $$1.ec().c(cfk.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jp> $$4 = $$1.ec().c(cfk.c);
         cpm $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bwo $$0, jh $$1, chn $$2) {
      eul $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
