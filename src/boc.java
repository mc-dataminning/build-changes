import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boc {
   public static bpq<blr> a(bjn $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bpq<blr> a(bjn $$0, Function<bmo, Float> $$1) {
      return brs.a(
         (Function<brs.b<blr>, ? extends App<brs.c<blr>, brv<blr>>>)($$2 -> $$2.group($$2.b(bvq.K), $$2.a(bvq.n), $$2.c(bvq.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        blr $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bvt $$10 = new bvt(new boq($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new boq($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
