import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsd {
   public static btr<bpp> a(bnl $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static btr<bpp> a(bnl $$0, Function<bqo, Float> $$1) {
      return bvt.a(
         (Function<bvt.b<bpp>, ? extends App<bvt.c<bpp>, bvw<bpp>>>)($$2 -> $$2.group($$2.b(bzr.K), $$2.a(bzr.n), $$2.c(bzr.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        bpp $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bzu $$10 = new bzu(new bsr($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bsr($$9, true));
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
