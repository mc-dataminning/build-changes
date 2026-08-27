import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bno {
   public static bmy<cdh> a(float $$0, int $$1) {
      return bqj.a((Function<bqj.b<cdh>, ? extends App<bqj.c<cdh>, bqm<cdh>>>)($$2 -> $$2.group($$2.c(buh.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.b($$4.dn())) {
                  return false;
               } else {
                  bwf $$6 = $$3.x();
                  int $$7 = $$6.a(iu.a($$4.dn()));
                  eju $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     eju $$10 = bvz.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(iu.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(iu.a(ht.a($$10)));
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
                     $$2x.a(new buk($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
