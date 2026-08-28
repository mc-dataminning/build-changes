import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvb {
   public static bwo<btm> a(int $$0, float $$1) {
      return byq.a(
         (Function<byq.b<btm>, ? extends App<byq.c<btm>, byt<btm>>>)($$2 -> $$2.group($$2.c(cco.m), $$2.a(cco.n), $$2.b(cco.o), $$2.b(cco.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     btk $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<ccq>b($$6).a($$9)) {
                        $$4.a(new bvo($$9, true));
                        $$7.H().a(-$$1, 0.0F);
                        $$7.r(ayu.c($$7.dF(), $$7.ba, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
