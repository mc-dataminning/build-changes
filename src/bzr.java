import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzr {
   public static bzb<cqv> a(float $$0, int $$1) {
      return ccn.a((Function<ccn.b<cqv>, ? extends App<ccn.c<cqv>, ccq<cqv>>>)($$2 -> $$2.group($$2.c(cgl.n)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.du())) {
                  return false;
               } else {
                  cil $$6 = $$3.A();
                  int $$7 = $$6.a(jy.a($$4.du()));
                  fex $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fex $$10 = cif.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jy.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jy.a(iv.a((jp)$$10)));
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
                     $$2x.a(new cgo($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
