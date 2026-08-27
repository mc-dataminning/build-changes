import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brw {
   public static bsa<boz> a(int $$0) {
      return buc.a(
         (Function<buc.b<boz>, ? extends App<buc.c<boz>, buf<boz>>>)($$1 -> $$1.group($$1.a(bya.n), $$1.b(bya.o), $$1.c(bya.p), $$1.b(bya.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     box $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<byc>b($$5).a($$9)) {
                        $$2.a(new bra($$9, true));
                        $$7.a(bmk.a);
                        $$7.B($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(boz $$0) {
      return $$0.b($$1 -> {
         cpl $$2 = $$1.d();
         return $$2 instanceof cqg && $$0.a((cqg)$$2);
      });
   }
}
