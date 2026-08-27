import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cef<E extends cdx> {
   public static boc<bmk> a(int $$0) {
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$1 -> $$1.group($$1.b(bvm.ac), $$1.a(bvm.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eU().b()) {
                        return false;
                     } else {
                        Optional<cbt> $$7 = $$1.a($$3);
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
