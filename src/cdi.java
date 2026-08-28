import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cdi {
   public static bzx<cru> a(float $$0) {
      return cdj.a(
         (Function<cdj.b<cru>, ? extends App<cdj.c<cru>, cdm<cru>>>)($$1 -> $$1.group($$1.b(chh.d), $$1.c(chh.c), $$1.b(chh.g), $$1.a(chh.n), $$1.a(chh.o))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if (!$$7.gF().b().a(crx.b)) {
                           return false;
                        } else {
                           iw $$9 = $$1.<jf>b($$2).b();
                           Optional<jg<cjk>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<byf>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cru && $$1xxx != $$7)
                                 .map($$0xxxx -> (cru)$$0xxxx)
                                 .filter(byf::bJ)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ec().c(chh.c).isEmpty()) {
                                       bzy.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ec().a(chh.d, jf.a($$6x.aj(), $$9));
                                       agx.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jg<cjk> $$0, cru $$1, iw $$2) {
      boolean $$3 = $$1.ec().c(chh.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jf> $$4 = $$1.ec().c(chh.c);
         jg<crx> $$5 = $$1.gF().b();
         if ($$5.a().b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(byn $$0, iw $$1, cjk $$2) {
      eyo $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
