import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class boc {
   private static final int a = 10;
   private static final int b = 7;

   public static bmj<bjr> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bmj<bjr> a(float $$0, int $$1, int $$2) {
      return bol.a((Function<bol.b<bjr>, ? extends App<bol.c<bjr>, boo<bjr>>>)($$3 -> $$3.group($$3.c(bsj.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               gw $$7 = $$5.dl();
               ehp $$8;
               if ($$4.b($$7)) {
                  $$8 = bub.a($$5, $$1, $$2);
               } else {
                  hz $$9 = hz.a($$7);
                  hz $$10 = blb.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = bty.a($$5, $$1, $$2, ehp.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bub.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bsm($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
