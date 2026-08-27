import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmk {
   private static final int a = 1;

   public static ble<bjm> a(float $$0) {
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$1 -> $$1.group($$1.a(bsn.n), $$1.c(bsn.m), $$1.b(bsn.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bN()) {
                        return false;
                     } else {
                        biw $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new blo($$8, true));
                           $$3.a(new bsq(new blo($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
