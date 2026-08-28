import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class clw<E extends clo> {
   public static bvk<btq> a(int $$0) {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$1 -> $$1.group($$1.b(ccu.ad), $$1.a(ccu.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eY().e()) {
                        return false;
                     } else {
                        Optional<cji> $$7 = $$1.a($$3);
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
