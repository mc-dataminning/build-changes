import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cam {
   public static bxb<cof> a(float $$0) {
      return can.a(
         (Function<can.b<cof>, ? extends App<can.c<cof>, caq<cof>>>)($$1 -> $$1.group($$1.b(cel.d), $$1.c(cel.c), $$1.b(cel.g), $$1.a(cel.m), $$1.a(cel.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if ($$7.gx().b() != coi.b) {
                           return false;
                        } else {
                           jh $$9 = $$1.<jp>b($$2).b();
                           Optional<jq<cgo>> $$10 = $$6x.z().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bvh>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cof && $$1xxx != $$7)
                                 .map($$0xxxx -> (cof)$$0xxxx)
                                 .filter(bvh::bL)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cel.c).isEmpty()) {
                                       bxc.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cel.d, jp.a($$6x.ag(), $$9));
                                       agt.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jq<cgo> $$0, cof $$1, jh $$2) {
      boolean $$3 = $$1.eb().c(cel.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jp> $$4 = $$1.eb().c(cel.c);
         coi $$5 = $$1.gx().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bvp $$0, jh $$1, cgo $$2) {
      esj $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
