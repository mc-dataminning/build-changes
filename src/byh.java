import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byh {
   private static final int a = 1;

   public static bxa<bvg> a(float $$0) {
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$1 -> $$1.group($$1.a(cek.n), $$1.c(cek.m), $$1.b(cek.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        buk $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bxk($$8, true));
                           $$3.a(new cen(new bxk($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
