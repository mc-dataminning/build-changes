import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cal {
   public static bxa<coh> a(float $$0) {
      return cam.a(
         (Function<cam.b<coh>, ? extends App<cam.c<coh>, cap<coh>>>)($$1 -> $$1.group($$1.b(cek.d), $$1.c(cek.c), $$1.b(cek.g), $$1.a(cek.m), $$1.a(cek.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if ($$7.gC().b() != cok.b) {
                           return false;
                        } else {
                           ji $$9 = $$1.<jq>b($$2).b();
                           Optional<jr<cgn>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bvg>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof coh && $$1xxx != $$7)
                                 .map($$0xxxx -> (coh)$$0xxxx)
                                 .filter(bvg::bL)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cek.c).isEmpty()) {
                                       bxb.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cek.d, jq.a($$6x.ai(), $$9));
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

   private static boolean a(jr<cgn> $$0, coh $$1, ji $$2) {
      boolean $$3 = $$1.eb().c(cek.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jq> $$4 = $$1.eb().c(cek.c);
         cok $$5 = $$1.gC().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bvo $$0, ji $$1, cgn $$2) {
      etm $$3 = $$0.P().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
