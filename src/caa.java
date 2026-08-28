import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class caa {
   public static bwp<cnt> a(float $$0) {
      return cab.a(
         (Function<cab.b<cnt>, ? extends App<cab.c<cnt>, cae<cnt>>>)($$1 -> $$1.group($$1.b(cdz.d), $$1.c(cdz.c), $$1.b(cdz.g), $$1.a(cdz.m), $$1.a(cdz.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gF().b() != cnw.b) {
                           return false;
                        } else {
                           jg $$9 = $$1.<jo>b($$2).b();
                           Optional<jp<cgc>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<buv>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cnt && $$1xxx != $$7)
                                 .map($$0xxxx -> (cnt)$$0xxxx)
                                 .filter(buv::bM)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ed().c(cdz.c).isEmpty()) {
                                       bwq.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ed().a(cdz.d, jo.a($$6x.ag(), $$9));
                                       agr.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jp<cgc> $$0, cnt $$1, jg $$2) {
      boolean $$3 = $$1.ed().c(cdz.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jo> $$4 = $$1.ed().c(cdz.c);
         cnw $$5 = $$1.gF().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bvd $$0, jg $$1, cgc $$2) {
      ers $$3 = $$0.P().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
