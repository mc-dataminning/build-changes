import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsu {
   private static final int a = 1;

   public static bqq<boz> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bqq<boz> a(Function<box, Float> $$0) {
      return buc.a(
         (Function<buc.b<boz>, ? extends App<buc.c<boz>, buf<boz>>>)($$1 -> $$1.group($$1.a(bya.m), $$1.a(bya.n), $$1.b(bya.o), $$1.a(bya.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     box $$9 = $$1.b($$4);
                     Optional<byc> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bqr.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bra($$9, true));
                        $$2.a(new byd(new bra($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
