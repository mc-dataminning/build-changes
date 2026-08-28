import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ccc {
   public static byr<cqe> a(float $$0) {
      return ccd.a(
         (Function<ccd.b<cqe>, ? extends App<ccd.c<cqe>, ccg<cqe>>>)($$1 -> $$1.group($$1.b(cgb.d), $$1.c(cgb.c), $$1.b(cgb.g), $$1.a(cgb.n), $$1.a(cgb.o))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if (!$$7.gy().b().a(cqh.b)) {
                           return false;
                        } else {
                           iu $$9 = $$1.<jd>b($$2).b();
                           Optional<je<cie>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bwz>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cqe && $$1xxx != $$7)
                                 .map($$0xxxx -> (cqe)$$0xxxx)
                                 .filter(bwz::bK)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cgb.c).isEmpty()) {
                                       bys.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cgb.d, jd.a($$6x.aj(), $$9));
                                       agk.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(je<cie> $$0, cqe $$1, iu $$2) {
      boolean $$3 = $$1.eb().c(cgb.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jd> $$4 = $$1.eb().c(cgb.c);
         je<cqh> $$5 = $$1.gy().b();
         if ($$5.a().b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bxh $$0, iu $$1, cie $$2) {
      ewj $$3 = $$0.O().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
