import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bre {
   private static final int a = 1;

   public static bpx<bog> a(float $$0) {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$1 -> $$1.group($$1.a(bxh.n), $$1.c(bxh.m), $$1.b(bxh.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        bno $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.m($$8);
                        } else {
                           $$2.a(new bqh($$8, true));
                           $$3.a(new bxk(new bqh($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
