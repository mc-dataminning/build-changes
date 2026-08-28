import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxm {
   public static bxq<bup> a(int $$0) {
      return bzs.a(
         (Function<bzs.b<bup>, ? extends App<bzs.c<bup>, bzv<bup>>>)($$1 -> $$1.group($$1.a(cdq.n), $$1.b(cdq.o), $$1.c(cdq.p), $$1.b(cdq.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bun $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cds>b($$5).a($$9)) {
                        $$2.a(new bwq($$9, true));
                        $$7.a(brr.a);
                        $$7.E($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bup $$0) {
      return $$0.b($$1 -> {
         cvn $$2 = $$1.h();
         return $$2 instanceof cwo && $$0.a((cwo)$$2);
      });
   }
}
