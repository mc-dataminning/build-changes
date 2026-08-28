import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwd {
   public static bxq<bup> a(int $$0, float $$1) {
      return bzs.a(
         (Function<bzs.b<bup>, ? extends App<bzs.c<bup>, bzv<bup>>>)($$2 -> $$2.group($$2.c(cdq.m), $$2.a(cdq.n), $$2.b(cdq.o), $$2.b(cdq.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bun $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cds>b($$6).a($$9)) {
                        $$4.a(new bwq($$9, true));
                        $$7.M().a(-$$1, 0.0F);
                        $$7.v(azf.c($$7.dI(), $$7.aV, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
