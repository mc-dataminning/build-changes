import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cbg {
   public static bxv<cpe> a(float $$0) {
      return cbh.a(
         (Function<cbh.b<cpe>, ? extends App<cbh.c<cpe>, cbk<cpe>>>)($$1 -> $$1.group($$1.b(cff.d), $$1.c(cff.c), $$1.b(cff.g), $$1.a(cff.m), $$1.a(cff.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if ($$7.gw().b() != cph.b) {
                           return false;
                        } else {
                           jh $$9 = $$1.<jp>b($$2).b();
                           Optional<jq<chi>> $$10 = $$6x.z().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bwb>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cpe && $$1xxx != $$7)
                                 .map($$0xxxx -> (cpe)$$0xxxx)
                                 .filter(bwb::bL)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cff.c).isEmpty()) {
                                       bxw.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cff.d, jp.a($$6x.ah(), $$9));
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

   private static boolean a(jq<chi> $$0, cpe $$1, jh $$2) {
      boolean $$3 = $$1.eb().c(cff.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jp> $$4 = $$1.eb().c(cff.c);
         cph $$5 = $$1.gw().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bwj $$0, jh $$1, chi $$2) {
      eud $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
