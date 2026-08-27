import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btn {
   public static btr<bqq> a(int $$0) {
      return bvt.a(
         (Function<bvt.b<bqq>, ? extends App<bvt.c<bqq>, bvw<bqq>>>)($$1 -> $$1.group($$1.a(bzr.n), $$1.b(bzr.o), $$1.c(bzr.p), $$1.b(bzr.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bqo $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bzt>b($$5).a($$9)) {
                        $$2.a(new bsr($$9, true));
                        $$7.a(bnz.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bqq $$0) {
      return $$0.b($$1 -> {
         cre $$2 = $$1.f();
         return $$2 instanceof crz && $$0.a((crz)$$2);
      });
   }
}
