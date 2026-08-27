import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bho {
   public static bjb<bfe> a(bdi $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bjb<bfe> a(bdi $$0, Function<bfz, Float> $$1) {
      return bld.a(
         (Function<bld.b<bfe>, ? extends App<bld.c<bfe>, blg<bfe>>>)($$2 -> $$2.group($$2.b(bpb.J), $$2.a(bpb.n), $$2.c(bpb.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.h_()) {
                        return false;
                     } else {
                        bfe $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bpe $$10 = new bpe(new bic($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bic($$9, true));
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
