import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvq {
   public static bvu<bss> a(int $$0) {
      return bxw.a(
         (Function<bxw.b<bss>, ? extends App<bxw.c<bss>, bxz<bss>>>)($$1 -> $$1.group($$1.a(cbu.n), $$1.b(cbu.o), $$1.c(cbu.p), $$1.b(cbu.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bsq $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cbw>b($$5).a($$9)) {
                        $$2.a(new buu($$9, true));
                        $$7.a(bpv.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bss $$0) {
      return $$0.b($$1 -> {
         ctl $$2 = $$1.g();
         return $$2 instanceof cuj && $$0.a((cuj)$$2);
      });
   }
}
