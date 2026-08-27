import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bse {
   public static btr<bqq> a(int $$0, float $$1) {
      return bvt.a(
         (Function<bvt.b<bqq>, ? extends App<bvt.c<bqq>, bvw<bqq>>>)($$2 -> $$2.group($$2.c(bzr.m), $$2.a(bzr.n), $$2.b(bzr.o), $$2.b(bzr.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bqo $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<bzt>b($$6).a($$9)) {
                        $$4.a(new bsr($$9, true));
                        $$7.H().a(-$$1, 0.0F);
                        $$7.r(axk.c($$7.dC(), $$7.aZ, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
