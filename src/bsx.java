import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsx {
   public static bsh<cjg> a(float $$0, int $$1) {
      return bvt.a((Function<bvt.b<cjg>, ? extends App<bvt.c<cjg>, bvw<cjg>>>)($$2 -> $$2.group($$2.c(bzr.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dm())) {
                  return false;
               } else {
                  cbr $$6 = $$3.y();
                  int $$7 = $$6.a(je.a($$4.dm()));
                  esa $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     esa $$10 = cbl.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(je.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(je.a(ib.a($$10)));
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
                     $$2x.a(new bzu($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
