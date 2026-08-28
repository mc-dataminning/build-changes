import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cda {
   private static final int a = 10;
   private static final int b = 7;

   public static cbh<byn> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static cbh<byn> a(float $$0, int $$1, int $$2) {
      return cdj.a((Function<cdj.b<byn>, ? extends App<cdj.c<byn>, cdm<byn>>>)($$3 -> $$3.group($$3.c(chh.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               iw $$7 = $$5.dv();
               fgc $$8;
               if ($$4.c($$7)) {
                  $$8 = cjb.a($$5, $$1, $$2);
               } else {
                  jz $$9 = jz.a($$7);
                  jz $$10 = bzy.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = ciy.a($$5, $$1, $$2, fgc.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cjb.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new chk($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
