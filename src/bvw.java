import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvw {
   public static bvg<cmi> a(float $$0, int $$1) {
      return bys.a((Function<bys.b<cmi>, ? extends App<bys.c<cmi>, byv<cmi>>>)($$2 -> $$2.group($$2.c(ccq.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dq())) {
                  return false;
               } else {
                  ceq $$6 = $$3.y();
                  int $$7 = $$6.a(kf.a($$4.dq()));
                  eww $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     eww $$10 = cek.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kf.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kf.a(jd.a((jw)$$10)));
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
                     $$2x.a(new cct($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
