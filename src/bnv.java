import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnv {
   public static bnz<bla> a(int $$0) {
      return bqb.a(
         (Function<bqb.b<bla>, ? extends App<bqb.c<bla>, bqe<bla>>>)($$1 -> $$1.group($$1.a(btz.n), $$1.b(btz.o), $$1.c(btz.p), $$1.b(btz.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bky $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bub>b($$5).a($$9)) {
                        $$2.a(new bna($$9, true));
                        $$7.a(bip.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bla $$0) {
      return $$0.b($$1 -> {
         ckw $$2 = $$1.d();
         return $$2 instanceof clr && $$0.a((clr)$$2);
      });
   }
}
