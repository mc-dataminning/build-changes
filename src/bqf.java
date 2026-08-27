import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqf {
   private static final int a = 10;
   private static final int b = 7;

   public static bom<blu> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bom<blu> a(float $$0, int $$1, int $$2) {
      return bqo.a((Function<bqo.b<blu>, ? extends App<bqo.c<blu>, bqr<blu>>>)($$3 -> $$3.group($$3.c(bum.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               hx $$7 = $$5.dn();
               ejz $$8;
               if ($$4.b($$7)) {
                  $$8 = bwe.a($$5, $$1, $$2);
               } else {
                  iy $$9 = iy.a($$7);
                  iy $$10 = bne.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = bwb.a($$5, $$1, $$2, ejz.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bwe.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bup($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
