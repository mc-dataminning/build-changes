import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bko {
   public static bma<bja> a(int $$0, float $$1) {
      return boc.a(
         (Function<boc.b<bja>, ? extends App<boc.c<bja>, bof<bja>>>)($$2 -> $$2.group($$2.c(bsa.m), $$2.a(bsa.n), $$2.b(bsa.o), $$2.b(bsa.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     biy $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<bsc>b($$6).a($$9)) {
                        $$4.a(new blb($$9, true));
                        $$7.E().a(-$$1, 0.0F);
                        $$7.r(arp.c($$7.dA(), $$7.aW, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
