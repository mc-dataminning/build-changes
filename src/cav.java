import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cav {
   private static final int a = 1;

   public static byr<bxb> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static byr<bxb> a(Function<bwz, Float> $$0) {
      return ccd.a(
         (Function<ccd.b<bxb>, ? extends App<ccd.c<bxb>, ccg<bxb>>>)($$1 -> $$1.group($$1.a(cgb.n), $$1.a(cgb.o), $$1.b(cgb.p), $$1.a(cgb.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bwz $$9 = $$1.b($$4);
                     Optional<cgd> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bys.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bzb($$9, true));
                        $$2.a(new cge(new bzb($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
