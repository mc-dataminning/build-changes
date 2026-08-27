import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bso {
   public static bss<bpr> a(int $$0) {
      return buu.a(
         (Function<buu.b<bpr>, ? extends App<buu.c<bpr>, bux<bpr>>>)($$1 -> $$1.group($$1.a(bys.n), $$1.b(bys.o), $$1.c(bys.p), $$1.b(bys.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bpp $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<byu>b($$5).a($$9)) {
                        $$2.a(new brs($$9, true));
                        $$7.a(bnc.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bpr $$0) {
      return $$0.b($$1 -> {
         cqh $$2 = $$1.d();
         return $$2 instanceof crc && $$0.a((crc)$$2);
      });
   }
}
