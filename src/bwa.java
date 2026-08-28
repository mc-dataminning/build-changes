import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwa {
   public static bvk<cml> a(float $$0, int $$1) {
      return byw.a((Function<byw.b<cml>, ? extends App<byw.c<cml>, byz<cml>>>)($$2 -> $$2.group($$2.c(ccu.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dp())) {
                  return false;
               } else {
                  ceu $$6 = $$3.y();
                  int $$7 = $$6.a(kb.a($$4.dp()));
                  evs $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     evs $$10 = ceo.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kb.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kb.a(iz.a($$10)));
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
                     $$2x.a(new ccx($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
