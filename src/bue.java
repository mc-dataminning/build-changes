import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bue {
   public static bvr<bsq> a(int $$0, float $$1) {
      return bxt.a(
         (Function<bxt.b<bsq>, ? extends App<bxt.c<bsq>, bxw<bsq>>>)($$2 -> $$2.group($$2.c(cbr.m), $$2.a(cbr.n), $$2.b(cbr.o), $$2.b(cbr.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bso $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cbt>b($$6).a($$9)) {
                        $$4.a(new bur($$9, true));
                        $$7.G().a(-$$1, 0.0F);
                        $$7.r(aym.c($$7.dK(), $$7.bl, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
