import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btb {
   private static final int a = 36;

   public static bpx<bog> a() {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$0 -> $$0.group($$0.a(bxh.x), $$0.a(bxh.y), $$0.a(bxh.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bog>a($$2).filter($$1xx -> $$1xx.f((bno)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dO().a($$4.Y(), $$4.X());
                     }

                     return true;
                  }))
      );
   }
}
