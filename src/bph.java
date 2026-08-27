import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bph {
   private static final float a = 0.3F;

   public static boh<blg> a() {
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$0 -> $$0.group($$0.a(buh.m), $$0.a(buh.n), $$0.b(buh.e), $$0.b(buh.h), $$0.c(buh.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ia $$9 = $$0.b($$3);
                     buj $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ad() == $$9.a() && $$9.b().a($$7.dl(), 4.0) && $$10.d($$0xxx -> bku.bf.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bku.bf.equals($$1xx.ai()) && $$1xx.f((bkq)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bni($$3xx, true));
                           $$1.a(new buk(new bni($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
