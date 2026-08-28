import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bze {
   private static final int a = 1;

   public static bxa<bvi> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bxa<bvi> a(Function<bvg, Float> $$0) {
      return cam.a(
         (Function<cam.b<bvi>, ? extends App<cam.c<bvi>, cap<bvi>>>)($$1 -> $$1.group($$1.a(cek.m), $$1.a(cek.n), $$1.b(cek.o), $$1.a(cek.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bvg $$9 = $$1.b($$4);
                     Optional<cem> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bxb.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bxk($$9, true));
                        $$2.a(new cen(new bxk($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
