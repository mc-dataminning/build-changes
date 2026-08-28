import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class caj {
   public static bwy<coc> a(float $$0) {
      return cak.a(
         (Function<cak.b<coc>, ? extends App<cak.c<coc>, can<coc>>>)($$1 -> $$1.group($$1.b(cei.d), $$1.c(cei.c), $$1.b(cei.g), $$1.a(cei.m), $$1.a(cei.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gF().b() != cof.b) {
                           return false;
                        } else {
                           jh $$9 = $$1.<jp>b($$2).b();
                           Optional<jq<cgl>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bve>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof coc && $$1xxx != $$7)
                                 .map($$0xxxx -> (coc)$$0xxxx)
                                 .filter(bve::bN)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ee().c(cei.c).isEmpty()) {
                                       bwz.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ee().a(cei.d, jp.a($$6x.ag(), $$9));
                                       agv.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jq<cgl> $$0, coc $$1, jh $$2) {
      boolean $$3 = $$1.ee().c(cei.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jp> $$4 = $$1.ee().c(cei.c);
         cof $$5 = $$1.gF().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bvm $$0, jh $$1, cgl $$2) {
      esc $$3 = $$0.P().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
