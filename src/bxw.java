import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxw {
   public static bzj<bwh> a(int $$0, float $$1) {
      return cbl.a(
         (Function<cbl.b<bwh>, ? extends App<cbl.c<bwh>, cbo<bwh>>>)($$2 -> $$2.group($$2.c(cfj.m), $$2.a(cfj.n), $$2.b(cfj.o), $$2.b(cfj.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bwf $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cfl>b($$6).a($$9)) {
                        $$4.a(new byj($$9, true));
                        $$7.I().a(-$$1, 0.0F);
                        $$7.v(bae.c($$7.dL(), $$7.aZ, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
