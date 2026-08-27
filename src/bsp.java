import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsp {
   private static final int a = 1;

   public static bri<bpp> a(float $$0) {
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$1 -> $$1.group($$1.a(bys.n), $$1.c(bys.m), $$1.b(bys.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        box $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new brs($$8, true));
                           $$3.a(new byv(new brs($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
