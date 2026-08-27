import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bvx {
   public static bsm<cjn> a(float $$0) {
      return bvy.a(
         (Function<bvy.b<cjn>, ? extends App<bvy.c<cjn>, bwb<cjn>>>)($$1 -> $$1.group($$1.b(bzw.d), $$1.c(bzw.c), $$1.b(bzw.g), $$1.a(bzw.m), $$1.a(bzw.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gy().b() != cjq.b) {
                           return false;
                        } else {
                           id $$9 = $$1.<im>b($$2).b();
                           Optional<in<cbz>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bqt>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cjn && $$1xxx != $$7)
                                 .map($$0xxxx -> (cjn)$$0xxxx)
                                 .filter(bqt::bA)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dP().c(bzw.c).isEmpty()) {
                                       bsn.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dP().a(bzw.d, im.a($$6x.ae(), $$9));
                                       afk.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(in<cbz> $$0, cjn $$1, id $$2) {
      boolean $$3 = $$1.dP().c(bzw.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<im> $$4 = $$1.dP().c(bzw.c);
         cjq $$5 = $$1.gy().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(brb $$0, id $$1, cbz $$2) {
      elp $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
