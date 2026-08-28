import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvl {
   public static buv<clx> a(float $$0, int $$1) {
      return byh.a((Function<byh.b<clx>, ? extends App<byh.c<clx>, byk<clx>>>)($$2 -> $$2.group($$2.c(ccf.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dq())) {
                  return false;
               } else {
                  cef $$6 = $$3.y();
                  int $$7 = $$6.a(kc.a($$4.dq()));
                  ewf $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ewf $$10 = cdz.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kc.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kc.a(ja.a($$10)));
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
                     $$2x.a(new cci($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
