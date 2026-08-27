import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class buh {
   public static bvu<bss> a(int $$0, float $$1) {
      return bxw.a(
         (Function<bxw.b<bss>, ? extends App<bxw.c<bss>, bxz<bss>>>)($$2 -> $$2.group($$2.c(cbu.m), $$2.a(cbu.n), $$2.b(cbu.o), $$2.b(cbu.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bsq $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cbw>b($$6).a($$9)) {
                        $$4.a(new buu($$9, true));
                        $$7.H().a(-$$1, 0.0F);
                        $$7.r(ayf.c($$7.dF(), $$7.ba, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
