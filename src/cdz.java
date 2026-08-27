import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cdz<E extends cdr> {
   public static bnx<bmf> a(int $$0) {
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$1 -> $$1.group($$1.b(bvh.ac), $$1.a(bvh.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eU().b()) {
                        return false;
                     } else {
                        Optional<cbo> $$7 = $$1.a($$3);
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
