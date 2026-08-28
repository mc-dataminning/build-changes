import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byp {
   public static bxz<cpi> a(float $$0, int $$1) {
      return cbl.a((Function<cbl.b<cpi>, ? extends App<cbl.c<cpi>, cbo<cpi>>>)($$2 -> $$2.group($$2.c(cfj.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  chj $$6 = $$3.z();
                  int $$7 = $$6.a(kj.a($$4.dv()));
                  fbx $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fbx $$10 = chd.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kj.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kj.a(jh.a((ka)$$10)));
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
                     $$2x.a(new cfm($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
