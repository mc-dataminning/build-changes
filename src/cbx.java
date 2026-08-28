import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbx {
   private static final int a = 10;
   private static final int b = 7;

   public static cae<bxk> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static cae<bxk> a(float $$0, int $$1, int $$2) {
      return ccg.a((Function<ccg.b<bxk>, ? extends App<ccg.c<bxk>, ccj<bxk>>>)($$3 -> $$3.group($$3.c(cge.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               iu $$7 = $$5.dv();
               fei $$8;
               if ($$4.c($$7)) {
                  $$8 = chy.a($$5, $$1, $$2);
               } else {
                  jx $$9 = jx.a($$7);
                  jx $$10 = byv.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = chv.a($$5, $$1, $$2, fei.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = chy.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cgh($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
