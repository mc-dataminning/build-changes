import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bta {
   private static final int a = 10;
   private static final int b = 7;

   public static brh<boo> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static brh<boo> a(float $$0, int $$1, int $$2) {
      return btj.a((Function<btj.b<boo>, ? extends App<btj.c<boo>, btm<boo>>>)($$3 -> $$3.group($$3.c(bxh.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               hz $$7 = $$5.dm();
               ens $$8;
               if ($$4.c($$7)) {
                  $$8 = bzb.a($$5, $$1, $$2);
               } else {
                  jb $$9 = jb.a($$7);
                  jb $$10 = bpy.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = byy.a($$5, $$1, $$2, ens.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bzb.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bxk($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
