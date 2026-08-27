import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class chs<E extends chk> {
   public static bri<bpp> a(int $$0) {
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$1 -> $$1.group($$1.b(bys.ad), $$1.a(bys.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eV().b()) {
                        return false;
                     } else {
                        Optional<cfe> $$7 = $$1.a($$3);
                        if ($$7.isPresent() && $$7.get().a($$5, (double)$$0)) {
                           return false;
                        } else {
                           $$2.b();
                           return true;
                        }
                     }
                  }))
      );
   }
}
