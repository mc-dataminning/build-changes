import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bts {
   private static final float a = 0.3F;

   public static bss<bpp> a() {
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$0 -> $$0.group($$0.a(bys.m), $$0.a(bys.n), $$0.b(bys.e), $$0.b(bys.h), $$0.c(bys.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ik $$9 = $$0.b($$3);
                     byu $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ad() == $$9.a() && $$9.b().a($$7.dk(), 4.0) && $$10.d($$0xxx -> bpd.bj.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bpd.bj.equals($$1xx.ai()) && $$1xx.g((box)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new brs($$3xx, true));
                           $$1.a(new byv(new brs($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
