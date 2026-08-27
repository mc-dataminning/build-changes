import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cgf<E extends cfx> {
   public static bpx<bog> a(int $$0) {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$1 -> $$1.group($$1.b(bxh.ad), $$1.a(bxh.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eU().b()) {
                        return false;
                     } else {
                        Optional<cds> $$7 = $$1.a($$3);
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
