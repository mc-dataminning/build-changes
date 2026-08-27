import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsf {
   private static final int a = 1;

   public static bqb<bok> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bqb<bok> a(Function<boi, Float> $$0) {
      return btn.a(
         (Function<btn.b<bok>, ? extends App<btn.c<bok>, btq<bok>>>)($$1 -> $$1.group($$1.a(bxl.m), $$1.a(bxl.n), $$1.b(bxl.o), $$1.a(bxl.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     boi $$9 = $$1.b($$4);
                     Optional<bxn> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bqc.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bql($$9, true));
                        $$2.a(new bxo(new bql($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
