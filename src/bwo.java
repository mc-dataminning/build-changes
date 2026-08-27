import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwo {
   public static bvs<bso> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bvs<bso> a(Predicate<bso> $$0, Function<bso, Float> $$1, int $$2) {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$3 -> $$3.group($$3.c(cbs.m), $$3.b(cbs.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new cbv($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
