import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cay {
   private static final int a = 1;

   public static byu<bxe> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static byu<bxe> a(Function<bxc, Float> $$0) {
      return ccg.a(
         (Function<ccg.b<bxe>, ? extends App<ccg.c<bxe>, ccj<bxe>>>)($$1 -> $$1.group($$1.a(cge.n), $$1.a(cge.o), $$1.b(cge.p), $$1.a(cge.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bxc $$9 = $$1.b($$4);
                     Optional<cgg> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && byv.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bze($$9, true));
                        $$2.a(new cgh(new bze($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
