import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blh {
   public static bkr<cba> a(float $$0, int $$1) {
      return boc.a((Function<boc.b<cba>, ? extends App<boc.c<cba>, bof<cba>>>)($$2 -> $$2.group($$2.c(bsa.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.b($$4.dk())) {
                  return false;
               } else {
                  bty $$6 = $$3.w();
                  int $$7 = $$6.a(hx.a($$4.dk()));
                  ehe $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ehe $$10 = bts.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(hx.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(hx.a(gu.a($$10)));
                        if ($$11 < $$7) {
                           $$8 = $$10;
                           break;
                        }

                        if ($$11 == $$7) {
                           $$8 = $$10;
                        }
                     }
                  }

                  if ($$8 != null) {
                     $$2x.a(new bsd($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
