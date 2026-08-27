import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnd {
   private static final int a = 1;

   public static bla<bjk> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bla<bjk> a(Function<bji, Float> $$0) {
      return bol.a(
         (Function<bol.b<bjk>, ? extends App<bol.c<bjk>, boo<bjk>>>)($$1 -> $$1.group($$1.a(bsj.m), $$1.a(bsj.n), $$1.b(bsj.o), $$1.a(bsj.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bji $$9 = $$1.b($$4);
                     Optional<bsl> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && blb.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new blk($$9, true));
                        $$2.a(new bsm(new blk($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
