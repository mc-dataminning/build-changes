import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byk {
   private static final int a = 1;

   public static bwg<bup> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bwg<bup> a(Function<bun, Float> $$0) {
      return bzs.a(
         (Function<bzs.b<bup>, ? extends App<bzs.c<bup>, bzv<bup>>>)($$1 -> $$1.group($$1.a(cdq.m), $$1.a(cdq.n), $$1.b(cdq.o), $$1.a(cdq.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bun $$9 = $$1.b($$4);
                     Optional<cds> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bwh.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bwq($$9, true));
                        $$2.a(new cdt(new bwq($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
