import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpv {
   public static bpx<bog> a(bxh<?> $$0, int $$1) {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$2 -> $$2.group($$2.a(bxh.o), $$2.c(bxh.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
