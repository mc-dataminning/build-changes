import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class boi {
   public static bky<cbh> a(float $$0) {
      return boj.a(
         (Function<boj.b<cbh>, ? extends App<boj.c<cbh>, bom<cbh>>>)($$1 -> $$1.group($$1.b(bsh.d), $$1.c(bsh.c), $$1.b(bsh.g), $$1.a(bsh.m), $$1.a(bsh.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.m_()) {
                           return false;
                        } else if ($$7.go().b() != cbk.b) {
                           return false;
                        } else {
                           gw $$9 = $$1.<hf>b($$2).b();
                           Optional<hg<bui>> $$10 = $$6x.w().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bjg>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cbh && $$1xxx != $$7)
                                 .map($$0xxxx -> (cbh)$$0xxxx)
                                 .filter(bjg::bv)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dN().c(bsh.c).isEmpty()) {
                                       bkz.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dN().a(bsh.d, hf.a($$6x.ac(), $$9));
                                       abc.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(hg<bui> $$0, cbh $$1, gw $$2) {
      boolean $$3 = $$1.dN().c(bsh.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<hf> $$4 = $$1.dN().c(bsh.c);
         cbk $$5 = $$1.go().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bjp $$0, gw $$1, bui $$2) {
      ebb $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
