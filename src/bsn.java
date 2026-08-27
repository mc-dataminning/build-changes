import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsn {
   public static bsr<bpq> a(int $$0) {
      return but.a(
         (Function<but.b<bpq>, ? extends App<but.c<bpq>, buw<bpq>>>)($$1 -> $$1.group($$1.a(byr.n), $$1.b(byr.o), $$1.c(byr.p), $$1.b(byr.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bpo $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<byt>b($$5).a($$9)) {
                        $$2.a(new brr($$9, true));
                        $$7.a(bnb.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bpq $$0) {
      return $$0.b($$1 -> {
         cqf $$2 = $$1.d();
         return $$2 instanceof cra && $$0.a((cra)$$2);
      });
   }
}
