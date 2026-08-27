import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bny {
   public static bpm<blp> a(bjl $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bpm<blp> a(bjl $$0, Function<bmk, Float> $$1) {
      return bro.a(
         (Function<bro.b<blp>, ? extends App<bro.c<blp>, brr<blp>>>)($$2 -> $$2.group($$2.b(bvm.J), $$2.a(bvm.n), $$2.c(bvm.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        blp $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bvp $$10 = new bvp(new bom($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bom($$9, true));
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
