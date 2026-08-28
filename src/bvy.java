import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvy {
   public static bvi<cmk> a(float $$0, int $$1) {
      return byu.a((Function<byu.b<cmk>, ? extends App<byu.c<cmk>, byx<cmk>>>)($$2 -> $$2.group($$2.c(ccs.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.do())) {
                  return false;
               } else {
                  ces $$6 = $$3.y();
                  int $$7 = $$6.a(kf.a($$4.do()));
                  exc $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     exc $$10 = cem.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kf.a($$1xxxx))));
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
                     $$2x.a(new ccv($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
