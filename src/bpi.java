import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpi {
   public static bpm<bmm> a(int $$0) {
      return bro.a(
         (Function<bro.b<bmm>, ? extends App<bro.c<bmm>, brr<bmm>>>)($$1 -> $$1.group($$1.a(bvm.n), $$1.b(bvm.o), $$1.c(bvm.p), $$1.b(bvm.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bmk $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bvo>b($$5).a($$9)) {
                        $$2.a(new bom($$9, true));
                        $$7.a(bjz.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bmm $$0) {
      return $$0.b($$1 -> {
         cms $$2 = $$1.d();
         return $$2 instanceof cnn && $$0.a((cnn)$$2);
      });
   }
}
