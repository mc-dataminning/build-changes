import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bll {
   private static gw a(bjd $$0, gw $$1) {
      arx $$2 = $$0.dK().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(arx $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bjd> bmc<E> a(bsc<gw> $$0, int $$1, float $$2) {
      return boe.a(
         (Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bsc.o), $$3.c(bsc.m), $$3.a(bsc.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     gw $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dk(), (double)$$1);
                     if (!$$8) {
                        bku.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
