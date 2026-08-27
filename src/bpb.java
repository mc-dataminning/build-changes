import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpb {
   private static final int a = 1;

   public static bmy<bli> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bmy<bli> a(Function<blg, Float> $$0) {
      return bqj.a(
         (Function<bqj.b<bli>, ? extends App<bqj.c<bli>, bqm<bli>>>)($$1 -> $$1.group($$1.a(buh.m), $$1.a(buh.n), $$1.b(buh.o), $$1.a(buh.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     blg $$9 = $$1.b($$4);
                     Optional<buj> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bmz.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bni($$9, true));
                        $$2.a(new buk(new bni($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
