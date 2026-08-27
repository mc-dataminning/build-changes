import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bod {
   public static bnn<cee> a(float $$0, int $$1) {
      return bqz.a((Function<bqz.b<cee>, ? extends App<bqz.c<cee>, brc<cee>>>)($$2 -> $$2.group($$2.c(bux.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.b($$4.dm())) {
                  return false;
               } else {
                  bww $$6 = $$3.x();
                  int $$7 = $$6.a(ix.a($$4.dm()));
                  elb $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     elb $$10 = bwq.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(ix.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(ix.a(hv.a($$10)));
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
                     $$2x.a(new bva($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
