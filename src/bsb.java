import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsb {
   private static final int a = 1;

   public static bpx<boi> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bpx<boi> a(Function<bog, Float> $$0) {
      return btj.a(
         (Function<btj.b<boi>, ? extends App<btj.c<boi>, btm<boi>>>)($$1 -> $$1.group($$1.a(bxh.m), $$1.a(bxh.n), $$1.b(bxh.o), $$1.a(bxh.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bog $$9 = $$1.b($$4);
                     Optional<bxj> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bpy.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bqh($$9, true));
                        $$2.a(new bxk(new bqh($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
