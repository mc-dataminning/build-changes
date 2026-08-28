import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byq {
   public static cae<bvt> a(btm $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static cae<bvt> a(btm $$0, Function<bxc, Float> $$1) {
      return ccg.a(
         (Function<ccg.b<bvt>, ? extends App<ccg.c<bvt>, ccj<bvt>>>)($$2 -> $$2.group($$2.b(cge.L), $$2.a(cge.o), $$2.c(cge.n))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bvt $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cgh $$10 = new cgh(new bze($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bze($$9, true));
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
