import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cbk {
   public static bxz<cpi> a(float $$0) {
      return cbl.a(
         (Function<cbl.b<cpi>, ? extends App<cbl.c<cpi>, cbo<cpi>>>)($$1 -> $$1.group($$1.b(cfj.d), $$1.c(cfj.c), $$1.b(cfj.g), $$1.a(cfj.m), $$1.a(cfj.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if ($$7.gw().b() != cpl.b) {
                           return false;
                        } else {
                           jh $$9 = $$1.<jp>b($$2).b();
                           Optional<jq<chm>> $$10 = $$6x.z().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bwf>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cpi && $$1xxx != $$7)
                                 .map($$0xxxx -> (cpi)$$0xxxx)
                                 .filter(bwf::bL)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cfj.c).isEmpty()) {
                                       bya.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cfj.d, jp.a($$6x.ah(), $$9));
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

   private static boolean a(jq<chm> $$0, cpi $$1, jh $$2) {
      boolean $$3 = $$1.eb().c(cfj.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jp> $$4 = $$1.eb().c(cfj.c);
         cpl $$5 = $$1.gw().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bwn $$0, jh $$1, chm $$2) {
      euk $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
