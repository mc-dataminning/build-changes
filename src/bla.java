import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bla {
   public static bmn<bir> a(bgp $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bmn<bir> a(bgp $$0, Function<bjm, Float> $$1) {
      return bop.a(
         (Function<bop.b<bir>, ? extends App<bop.c<bir>, bos<bir>>>)($$2 -> $$2.group($$2.b(bsn.J), $$2.a(bsn.n), $$2.c(bsn.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.m_()) {
                        return false;
                     } else {
                        bir $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bsq $$10 = new bsq(new blo($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new blo($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
