import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class clq<E extends cli> {
   public static bve<btk> a(int $$0) {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$1 -> $$1.group($$1.b(cco.ad), $$1.a(cco.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eY().e()) {
                        return false;
                     } else {
                        Optional<cjc> $$7 = $$1.a($$3);
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
