import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbz {
   private static final int a = 10;
   private static final int b = 7;

   public static cag<bxm> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static cag<bxm> a(float $$0, int $$1, int $$2) {
      return cci.a((Function<cci.b<bxm>, ? extends App<cci.c<bxm>, ccl<bxm>>>)($$3 -> $$3.group($$3.c(cgg.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               iu $$7 = $$5.dv();
               feq $$8;
               if ($$4.c($$7)) {
                  $$8 = cia.a($$5, $$1, $$2);
               } else {
                  jx $$9 = jx.a($$7);
                  jx $$10 = byx.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = chx.a($$5, $$1, $$2, feq.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cia.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cgj($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
