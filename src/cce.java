import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cce {
   private static final int a = 10;
   private static final int b = 7;

   public static cal<bxr> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static cal<bxr> a(float $$0, int $$1, int $$2) {
      return ccn.a((Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$3 -> $$3.group($$3.c(cgl.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               iv $$7 = $$5.du();
               fex $$8;
               if ($$4.c($$7)) {
                  $$8 = cif.a($$5, $$1, $$2);
               } else {
                  jy $$9 = jy.a($$7);
                  jy $$10 = bzc.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cic.a($$5, $$1, $$2, fex.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cif.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cgo($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
