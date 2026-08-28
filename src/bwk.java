import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwk {
   public static bwo<btm> a(int $$0) {
      return byq.a(
         (Function<byq.b<btm>, ? extends App<byq.c<btm>, byt<btm>>>)($$1 -> $$1.group($$1.a(cco.n), $$1.b(cco.o), $$1.c(cco.p), $$1.b(cco.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     btk $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<ccq>b($$5).a($$9)) {
                        $$2.a(new bvo($$9, true));
                        $$7.a(bqo.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(btm $$0) {
      return $$0.b($$1 -> {
         cuf $$2 = $$1.g();
         return $$2 instanceof cvd && $$0.a((cvd)$$2);
      });
   }
}
