import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class btu {
   public static bri<bpp> a(int $$0, BiPredicate<bpp, bpp> $$1) {
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$2 -> $$2.group($$2.b(bys.o), $$2.a(bys.ab), $$2.c(bys.ai), $$2.a(bys.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bpp $$10 = $$2.b($$3);
                     if (!$$10.ey()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dm(), (long)$$0);
                        if ($$10.ai() != bpd.by || $$7.Z().b(cwx.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
