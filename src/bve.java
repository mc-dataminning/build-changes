import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bve {
   public static bwr<btp> a(int $$0, float $$1) {
      return byt.a(
         (Function<byt.b<btp>, ? extends App<byt.c<btp>, byw<btp>>>)($$2 -> $$2.group($$2.c(ccr.m), $$2.a(ccr.n), $$2.b(ccr.o), $$2.b(ccr.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     btn $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cct>b($$6).a($$9)) {
                        $$4.a(new bvr($$9, true));
                        $$7.H().a(-$$1, 0.0F);
                        $$7.r(ayx.c($$7.dF(), $$7.ba, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
