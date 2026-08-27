import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class buk {
   private static final int a = 10;
   private static final int b = 7;

   public static bsr<bpw> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bsr<bpw> a(float $$0, int $$1, int $$2) {
      return but.a((Function<but.b<bpw>, ? extends App<but.c<bpw>, buw<bpw>>>)($$3 -> $$3.group($$3.c(byr.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ib $$7 = $$5.dm();
               epr $$8;
               if ($$4.c($$7)) {
                  $$8 = cal.a($$5, $$1, $$2);
               } else {
                  je $$9 = je.a($$7);
                  je $$10 = bri.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cai.a($$5, $$1, $$2, epr.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cal.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new byu($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
