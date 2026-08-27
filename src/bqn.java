import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqn {
   public static bpx<cgu> a(float $$0, int $$1) {
      return btj.a((Function<btj.b<cgu>, ? extends App<btj.c<cgu>, btm<cgu>>>)($$2 -> $$2.group($$2.c(bxh.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dm())) {
                  return false;
               } else {
                  bzh $$6 = $$3.y();
                  int $$7 = $$6.a(jb.a($$4.dm()));
                  ens $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ens $$10 = bzb.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jb.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jb.a(hz.a($$10)));
                        if ($$11 < $$7) {
                           $$8 = $$10;
                           break;
                        }

                        if ($$11 == $$7) {
                           $$8 = $$10;
                        }
                     }
                  }

                  if ($$8 != null) {
                     $$2x.a(new bxk($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
