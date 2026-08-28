import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxo {
   public static bzb<bvz> a(int $$0, float $$1) {
      return cbd.a(
         (Function<cbd.b<bvz>, ? extends App<cbd.c<bvz>, cbg<bvz>>>)($$2 -> $$2.group($$2.c(cfb.m), $$2.a(cfb.n), $$2.b(cfb.o), $$2.b(cfb.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bvx $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cfd>b($$6).a($$9)) {
                        $$4.a(new byb($$9, true));
                        $$7.I().a(-$$1, 0.0F);
                        $$7.v(azu.c($$7.dM(), $$7.aZ, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
