import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvn {
   public static bvr<bsq> a(int $$0) {
      return bxt.a(
         (Function<bxt.b<bsq>, ? extends App<bxt.c<bsq>, bxw<bsq>>>)($$1 -> $$1.group($$1.a(cbr.n), $$1.b(cbr.o), $$1.c(cbr.p), $$1.b(cbr.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bso $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cbt>b($$5).a($$9)) {
                        $$2.a(new bur($$9, true));
                        $$7.a(bpz.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bsq $$0) {
      return $$0.b($$1 -> {
         cuc $$2 = $$1.f();
         return $$2 instanceof cvi && $$0.a((cvi)$$2);
      });
   }
}
