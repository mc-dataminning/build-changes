import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brg {
   public static bqq<chn> a(float $$0, int $$1) {
      return buc.a((Function<buc.b<chn>, ? extends App<buc.c<chn>, buf<chn>>>)($$2 -> $$2.group($$2.c(bya.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dj())) {
                  return false;
               } else {
                  caa $$6 = $$3.y();
                  int $$7 = $$6.a(jd.a($$4.dj()));
                  eov $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     eov $$10 = bzu.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jd.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jd.a(ib.a($$10)));
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
                     $$2x.a(new byd($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
