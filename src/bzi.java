import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzi {
   private static final float a = 0.3F;

   public static byi<bve> a() {
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$0 -> $$0.group($$0.a(cei.m), $$0.a(cei.n), $$0.b(cei.e), $$0.b(cei.h), $$0.c(cei.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jp $$9 = $$0.b($$3);
                     cek $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ag() == $$9.a() && $$9.b().a($$7.dw(), 4.0) && $$10.d($$0xxx -> bup.bj.equals($$0xxx.ar()))) {
                        $$10.a($$1xx -> bup.bj.equals($$1xx.ar()) && $$1xx.g((bui)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bxi($$3xx, true));
                           $$1.a(new cel(new bxi($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
