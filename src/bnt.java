import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnt {
   private static final int a = 10;
   private static final int b = 7;

   public static bma<bjh> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bma<bjh> a(float $$0, int $$1, int $$2) {
      return boc.a((Function<boc.b<bjh>, ? extends App<boc.c<bjh>, bof<bjh>>>)($$3 -> $$3.group($$3.c(bsa.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               gu $$7 = $$5.dk();
               ehe $$8;
               if ($$4.b($$7)) {
                  $$8 = bts.a($$5, $$1, $$2);
               } else {
                  hx $$9 = hx.a($$7);
                  hx $$10 = bks.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = btp.a($$5, $$1, $$2, ehe.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bts.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bsd($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
