import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bww {
   public static byk<bub> a(bru $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static byk<bub> a(bru $$0, Function<bvg, Float> $$1) {
      return cam.a(
         (Function<cam.b<bub>, ? extends App<cam.c<bub>, cap<bub>>>)($$2 -> $$2.group($$2.b(cek.K), $$2.a(cek.n), $$2.c(cek.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.e_()) {
                        return false;
                     } else {
                        bub $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cen $$10 = new cen(new bxk($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bxk($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
