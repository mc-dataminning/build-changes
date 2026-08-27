import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ckw<E extends cko> {
   public static buh<bso> a(int $$0) {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$1 -> $$1.group($$1.b(cbr.ad), $$1.a(cbr.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fh().d()) {
                        return false;
                     } else {
                        Optional<cig> $$7 = $$1.a($$3);
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
