import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bng {
   public static bnk<bkl> a(int $$0) {
      return bpm.a(
         (Function<bpm.b<bkl>, ? extends App<bpm.c<bkl>, bpp<bkl>>>)($$1 -> $$1.group($$1.a(btk.n), $$1.b(btk.o), $$1.c(btk.p), $$1.b(btk.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bkj $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<btm>b($$5).a($$9)) {
                        $$2.a(new bml($$9, true));
                        $$7.a(bia.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bkl $$0) {
      return $$0.b($$1 -> {
         cke $$2 = $$1.d();
         return $$2 instanceof ckz && $$0.a((ckz)$$2);
      });
   }
}
