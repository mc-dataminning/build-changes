import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cam {
   public static bxb<coi> a(float $$0) {
      return can.a(
         (Function<can.b<coi>, ? extends App<can.c<coi>, caq<coi>>>)($$1 -> $$1.group($$1.b(cel.d), $$1.c(cel.c), $$1.b(cel.g), $$1.a(cel.m), $$1.a(cel.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if ($$7.gC().b() != col.b) {
                           return false;
                        } else {
                           ji $$9 = $$1.<jq>b($$2).b();
                           Optional<jr<cgo>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bvh>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof coi && $$1xxx != $$7)
                                 .map($$0xxxx -> (coi)$$0xxxx)
                                 .filter(bvh::bL)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cel.c).isEmpty()) {
                                       bxc.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cel.d, jq.a($$6x.ai(), $$9));
                                       agd.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jr<cgo> $$0, coi $$1, ji $$2) {
      boolean $$3 = $$1.eb().c(cel.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jq> $$4 = $$1.eb().c(cel.c);
         col $$5 = $$1.gC().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bvp $$0, ji $$1, cgo $$2) {
      etn $$3 = $$0.P().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
