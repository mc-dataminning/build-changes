import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bjv {
   private static final int a = 1;

   public static bhs<bgb> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bhs<bgb> a(Function<bfz, Float> $$0) {
      return bld.a(
         (Function<bld.b<bgb>, ? extends App<bld.c<bgb>, blg<bgb>>>)($$1 -> $$1.group($$1.a(bpb.m), $$1.a(bpb.n), $$1.b(bpb.o), $$1.a(bpb.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bfz $$9 = $$1.b($$4);
                     Optional<bpd> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bht.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bic($$9, true));
                        $$2.a(new bpe(new bic($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
