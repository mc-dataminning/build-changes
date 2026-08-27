import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bta {
   private static final float a = 0.3F;

   public static bsa<box> a() {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$0 -> $$0.group($$0.a(bya.m), $$0.a(bya.n), $$0.b(bya.e), $$0.b(bya.h), $$0.c(bya.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ik $$9 = $$0.b($$3);
                     byc $$10 = $$0.b($$4);
                     if ($$6.F_().a(100) == 0 && $$6.ad() == $$9.a() && $$9.b().a($$7.dh(), 4.0) && $$10.d($$0xxx -> bol.bh.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bol.bh.equals($$1xx.ai()) && $$1xx.f((bof)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bra($$3xx, true));
                           $$1.a(new byd(new bra($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
