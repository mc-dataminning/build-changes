import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bna {
   public static bom<bln> a(int $$0, float $$1) {
      return bqo.a(
         (Function<bqo.b<bln>, ? extends App<bqo.c<bln>, bqr<bln>>>)($$2 -> $$2.group($$2.c(bum.m), $$2.a(bum.n), $$2.b(bum.o), $$2.b(bum.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bll $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<buo>b($$6).a($$9)) {
                        $$4.a(new bnn($$9, true));
                        $$7.K().a(-$$1, 0.0F);
                        $$7.r(atq.c($$7.dD(), $$7.aW, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
