import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bix {
   public static bjb<bgb> a(int $$0) {
      return bld.a(
         (Function<bld.b<bgb>, ? extends App<bld.c<bgb>, blg<bgb>>>)($$1 -> $$1.group($$1.a(bpb.n), $$1.b(bpb.o), $$1.c(bpb.p), $$1.b(bpb.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bfz $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.k($$9) && $$1.<bpd>b($$5).a($$9)) {
                        $$2.a(new bic($$9, true));
                        $$7.a(bdw.a);
                        $$7.z($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bgb $$0) {
      return $$0.b($$1 -> {
         cfu $$2 = $$1.d();
         return $$2 instanceof cgp && $$0.a((cgp)$$2);
      });
   }
}
