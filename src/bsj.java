import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bsj {
   public static bpx<bog> a(int $$0, BiPredicate<bog, bog> $$1) {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$2 -> $$2.group($$2.b(bxh.o), $$2.a(bxh.ab), $$2.c(bxh.ai), $$2.a(bxh.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bog $$10 = $$2.b($$3);
                     if (!$$10.ex()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dm(), (long)$$0);
                        if ($$10.ai() != bnu.bw || $$7.Z().b(cvj.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
