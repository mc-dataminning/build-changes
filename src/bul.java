import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bul {
   private static final int a = 1;

   public static bsh<bqq> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bsh<bqq> a(Function<bqo, Float> $$0) {
      return bvt.a(
         (Function<bvt.b<bqq>, ? extends App<bvt.c<bqq>, bvw<bqq>>>)($$1 -> $$1.group($$1.a(bzr.m), $$1.a(bzr.n), $$1.b(bzr.o), $$1.a(bzr.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bqo $$9 = $$1.b($$4);
                     Optional<bzt> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bsi.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bsr($$9, true));
                        $$2.a(new bzu(new bsr($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
