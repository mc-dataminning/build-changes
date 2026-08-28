import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cae {
   public static bzo<crl> a(float $$0, int $$1) {
      return cda.a((Function<cda.b<crl>, ? extends App<cda.c<crl>, cdd<crl>>>)($$2 -> $$2.group($$2.c(cgy.n)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  ciy $$6 = $$3.A();
                  int $$7 = $$6.a(jz.a($$4.dv()));
                  ffs $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ffs $$10 = cis.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jz.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jz.a(iw.a((jq)$$10)));
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
                     $$2x.a(new chb($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
