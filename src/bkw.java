import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkw {
   public static bmj<bin> a(bgl $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bmj<bin> a(bgl $$0, Function<bji, Float> $$1) {
      return bol.a(
         (Function<bol.b<bin>, ? extends App<bol.c<bin>, boo<bin>>>)($$2 -> $$2.group($$2.b(bsj.J), $$2.a(bsj.n), $$2.c(bsj.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.m_()) {
                        return false;
                     } else {
                        bin $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bsm $$10 = new bsm(new blk($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new blk($$9, true));
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
