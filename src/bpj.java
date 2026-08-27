import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpj {
   public static bpn<bmn> a(int $$0) {
      return brp.a(
         (Function<brp.b<bmn>, ? extends App<brp.c<bmn>, brs<bmn>>>)($$1 -> $$1.group($$1.a(bvn.n), $$1.b(bvn.o), $$1.c(bvn.p), $$1.b(bvn.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bml $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bvp>b($$5).a($$9)) {
                        $$2.a(new bon($$9, true));
                        $$7.a(bka.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bmn $$0) {
      return $$0.b($$1 -> {
         cmt $$2 = $$1.d();
         return $$2 instanceof cno && $$0.a((cno)$$2);
      });
   }
}
