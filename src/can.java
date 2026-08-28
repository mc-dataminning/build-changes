import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class can {
   public static bxc<coj> a(float $$0) {
      return cao.a(
         (Function<cao.b<coj>, ? extends App<cao.c<coj>, car<coj>>>)($$1 -> $$1.group($$1.b(cem.d), $$1.c(cem.c), $$1.b(cem.g), $$1.a(cem.m), $$1.a(cem.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if ($$7.gC().b() != com.b) {
                           return false;
                        } else {
                           ji $$9 = $$1.<jq>b($$2).b();
                           Optional<jr<cgp>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bvi>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof coj && $$1xxx != $$7)
                                 .map($$0xxxx -> (coj)$$0xxxx)
                                 .filter(bvi::bL)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cem.c).isEmpty()) {
                                       bxd.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cem.d, jq.a($$6x.ai(), $$9));
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

   private static boolean a(jr<cgp> $$0, coj $$1, ji $$2) {
      boolean $$3 = $$1.eb().c(cem.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jq> $$4 = $$1.eb().c(cem.c);
         com $$5 = $$1.gC().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bvq $$0, ji $$1, cgp $$2) {
      eto $$3 = $$0.P().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
