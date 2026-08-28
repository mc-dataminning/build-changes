import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvf {
   public static bws<btp> a(int $$0, float $$1) {
      return byu.a(
         (Function<byu.b<btp>, ? extends App<byu.c<btp>, byx<btp>>>)($$2 -> $$2.group($$2.c(ccs.m), $$2.a(ccs.n), $$2.b(ccs.o), $$2.b(ccs.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     btn $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<ccu>b($$6).a($$9)) {
                        $$4.a(new bvs($$9, true));
                        $$7.J().a(-$$1, 0.0F);
                        $$7.t(ayo.c($$7.dF(), $$7.ba, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
