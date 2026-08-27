import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class buw {
   private static final float a = 0.3F;

   public static btw<bqt> a() {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$0 -> $$0.group($$0.a(bzw.m), $$0.a(bzw.n), $$0.b(bzw.e), $$0.b(bzw.h), $$0.c(bzw.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     im $$9 = $$0.b($$3);
                     bzy $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dk(), 4.0) && $$10.d($$0xxx -> bqg.bi.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bqg.bi.equals($$1xx.ai()) && $$1xx.g((bqa)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bsw($$3xx, true));
                           $$1.a(new bzz(new bsw($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
