import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class caf {
   public static bwu<cny> a(float $$0) {
      return cag.a(
         (Function<cag.b<cny>, ? extends App<cag.c<cny>, caj<cny>>>)($$1 -> $$1.group($$1.b(cee.d), $$1.c(cee.c), $$1.b(cee.g), $$1.a(cee.m), $$1.a(cee.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gE().b() != cob.b) {
                           return false;
                        } else {
                           jh $$9 = $$1.<jp>b($$2).b();
                           Optional<jq<cgh>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bva>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cny && $$1xxx != $$7)
                                 .map($$0xxxx -> (cny)$$0xxxx)
                                 .filter(bva::bM)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ed().c(cee.c).isEmpty()) {
                                       bwv.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ed().a(cee.d, jp.a($$6x.ag(), $$9));
                                       ags.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jq<cgh> $$0, cny $$1, jh $$2) {
      boolean $$3 = $$1.ed().c(cee.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jp> $$4 = $$1.ed().c(cee.c);
         cob $$5 = $$1.gE().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bvi $$0, jh $$1, cgh $$2) {
      ery $$3 = $$0.P().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
