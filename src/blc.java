import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class blc {
   public static bhs<byb> a(float $$0) {
      return bld.a(
         (Function<bld.b<byb>, ? extends App<bld.c<byb>, blg<byb>>>)($$1 -> $$1.group($$1.b(bpb.d), $$1.c(bpb.c), $$1.b(bpb.g), $$1.a(bpb.m), $$1.a(bpb.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.h_()) {
                           return false;
                        } else if ($$7.gj().b() != bye.b) {
                           return false;
                        } else {
                           gu $$9 = $$1.<hd>b($$2).b();
                           Optional<he<brc>> $$10 = $$6x.w().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bfz>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof byb && $$1xxx != $$7)
                                 .map($$0xxxx -> (byb)$$0xxxx)
                                 .filter(bfz::bs)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dK().c(bpb.c).isEmpty()) {
                                       bht.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dK().a(bpb.d, hd.a($$6x.ac(), $$9));
                                       za.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(he<brc> $$0, byb $$1, gu $$2) {
      boolean $$3 = $$1.dK().c(bpb.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<hd> $$4 = $$1.dK().c(bpb.c);
         bye $$5 = $$1.gj().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bgi $$0, gu $$1, brc $$2) {
      dxt $$3 = $$0.J().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
