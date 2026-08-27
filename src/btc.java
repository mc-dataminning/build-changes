import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btc {
   public static bsm<cjn> a(float $$0, int $$1) {
      return bvy.a((Function<bvy.b<cjn>, ? extends App<bvy.c<cjn>, bwb<cjn>>>)($$2 -> $$2.group($$2.c(bzw.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dm())) {
                  return false;
               } else {
                  cbw $$6 = $$3.y();
                  int $$7 = $$6.a(jg.a($$4.dm()));
                  esj $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     esj $$10 = cbq.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jg.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jg.a(id.a($$10)));
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
                     $$2x.a(new bzz($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
