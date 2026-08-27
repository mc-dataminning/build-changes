import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class brf {
   private static final int a = 10;
   private static final int b = 7;

   public static bpm<bmt> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bpm<bmt> a(float $$0, int $$1, int $$2) {
      return bro.a((Function<bro.b<bmt>, ? extends App<bro.c<bmt>, brr<bmt>>>)($$3 -> $$3.group($$3.c(bvm.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               hx $$7 = $$5.dm();
               els $$8;
               if ($$4.c($$7)) {
                  $$8 = bxf.a($$5, $$1, $$2);
               } else {
                  iz $$9 = iz.a($$7);
                  iz $$10 = bod.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = bxc.a($$5, $$1, $$2, els.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bxf.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bvp($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
