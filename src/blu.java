import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blu {
   public static ble<cbn> a(float $$0, int $$1) {
      return bop.a((Function<bop.b<cbn>, ? extends App<bop.c<cbn>, bos<cbn>>>)($$2 -> $$2.group($$2.c(bsn.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.b($$4.dl())) {
                  return false;
               } else {
                  bul $$6 = $$3.w();
                  int $$7 = $$6.a(hw.a($$4.dl()));
                  ehh $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ehh $$10 = buf.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(hw.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(hw.a(gw.a($$10)));
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
                     $$2x.a(new bsq($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
