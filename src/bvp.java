import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvp {
   private static final int a = 1;

   public static bui<bso> a(float $$0) {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$1 -> $$1.group($$1.a(cbs.n), $$1.c(cbs.m), $$1.b(cbs.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bR()) {
                        return false;
                     } else {
                        bru $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bus($$8, true));
                           $$3.a(new cbv(new bus($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
