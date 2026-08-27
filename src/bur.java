import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bur {
   private static final float a = 0.3F;

   public static btr<bqo> a() {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$0 -> $$0.group($$0.a(bzr.m), $$0.a(bzr.n), $$0.b(bzr.e), $$0.b(bzr.h), $$0.c(bzr.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ik $$9 = $$0.b($$3);
                     bzt $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dk(), 4.0) && $$10.d($$0xxx -> bqb.bi.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bqb.bi.equals($$1xx.ai()) && $$1xx.g((bpv)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bsr($$3xx, true));
                           $$1.a(new bzu(new bsr($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
