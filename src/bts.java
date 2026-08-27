import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bts {
   public static btw<bqv> a(int $$0) {
      return bvy.a(
         (Function<bvy.b<bqv>, ? extends App<bvy.c<bqv>, bwb<bqv>>>)($$1 -> $$1.group($$1.a(bzw.n), $$1.b(bzw.o), $$1.c(bzw.p), $$1.b(bzw.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bqt $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bzy>b($$5).a($$9)) {
                        $$2.a(new bsw($$9, true));
                        $$7.a(boe.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bqv $$0) {
      return $$0.b($$1 -> {
         crn $$2 = $$1.f();
         return $$2 instanceof csi && $$0.a((csi)$$2);
      });
   }
}
