import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cbd {
   public static bxs<cpd> a(float $$0) {
      return cbe.a(
         (Function<cbe.b<cpd>, ? extends App<cbe.c<cpd>, cbh<cpd>>>)($$1 -> $$1.group($$1.b(cfc.d), $$1.c(cfc.c), $$1.b(cfc.g), $$1.a(cfc.m), $$1.a(cfc.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if ($$7.gA().b() != cpg.b) {
                           return false;
                        } else {
                           ji $$9 = $$1.<jq>b($$2).b();
                           Optional<jr<chf>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bvy>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cpd && $$1xxx != $$7)
                                 .map($$0xxxx -> (cpd)$$0xxxx)
                                 .filter(bvy::bJ)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ea().c(cfc.c).isEmpty()) {
                                       bxt.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ea().a(cfc.d, jq.a($$6x.aj(), $$9));
                                       agc.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jr<chf> $$0, cpd $$1, ji $$2) {
      boolean $$3 = $$1.ea().c(cfc.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jq> $$4 = $$1.ea().c(cfc.c);
         cpg $$5 = $$1.gA().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bwg $$0, ji $$1, chf $$2) {
      euk $$3 = $$0.O().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
