import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bok {
   public static bla<cbj> a(float $$0) {
      return bol.a(
         (Function<bol.b<cbj>, ? extends App<bol.c<cbj>, boo<cbj>>>)($$1 -> $$1.group($$1.b(bsj.d), $$1.c(bsj.c), $$1.b(bsj.g), $$1.a(bsj.m), $$1.a(bsj.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.m_()) {
                           return false;
                        } else if ($$7.go().b() != cbm.b) {
                           return false;
                        } else {
                           gw $$9 = $$1.<hf>b($$2).b();
                           Optional<hg<buk>> $$10 = $$6x.w().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bji>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cbj && $$1xxx != $$7)
                                 .map($$0xxxx -> (cbj)$$0xxxx)
                                 .filter(bji::bv)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dN().c(bsj.c).isEmpty()) {
                                       blb.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dN().a(bsj.d, hf.a($$6x.ac(), $$9));
                                       abd.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(hg<buk> $$0, cbj $$1, gw $$2) {
      boolean $$3 = $$1.dN().c(bsj.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<hf> $$4 = $$1.dN().c(bsj.c);
         cbm $$5 = $$1.go().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bjr $$0, gw $$1, buk $$2) {
      ebd $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
