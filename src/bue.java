import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bue {
   public static bvs<bro> a(bpf $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bvs<bro> a(bpf $$0, Function<bso, Float> $$1) {
      return bxu.a(
         (Function<bxu.b<bro>, ? extends App<bxu.c<bro>, bxx<bro>>>)($$2 -> $$2.group($$2.b(cbs.K), $$2.a(cbs.n), $$2.c(cbs.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        bro $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cbv $$10 = new cbv(new bus($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bus($$9, true));
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
