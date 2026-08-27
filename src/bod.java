import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bod {
   public static boh<bli> a(int $$0) {
      return bqj.a(
         (Function<bqj.b<bli>, ? extends App<bqj.c<bli>, bqm<bli>>>)($$1 -> $$1.group($$1.a(buh.n), $$1.b(buh.o), $$1.c(buh.p), $$1.b(buh.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     blg $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<buj>b($$5).a($$9)) {
                        $$2.a(new bni($$9, true));
                        $$7.a(biw.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bli $$0) {
      return $$0.b($$1 -> {
         cle $$2 = $$1.d();
         return $$2 instanceof clz && $$0.a((clz)$$2);
      });
   }
}
