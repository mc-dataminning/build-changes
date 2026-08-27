import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpd {
   public static bph<bmh> a(int $$0) {
      return brj.a(
         (Function<brj.b<bmh>, ? extends App<brj.c<bmh>, brm<bmh>>>)($$1 -> $$1.group($$1.a(bvh.n), $$1.b(bvh.o), $$1.c(bvh.p), $$1.b(bvh.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bmf $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bvj>b($$5).a($$9)) {
                        $$2.a(new boh($$9, true));
                        $$7.a(bju.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bmh $$0) {
      return $$0.b($$1 -> {
         cmm $$2 = $$1.d();
         return $$2 instanceof cnh && $$0.a((cnh)$$2);
      });
   }
}
