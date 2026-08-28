import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzh {
   public static byr<cqe> a(float $$0, int $$1) {
      return ccd.a((Function<ccd.b<cqe>, ? extends App<ccd.c<cqe>, ccg<cqe>>>)($$2 -> $$2.group($$2.c(cgb.n)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dv())) {
                  return false;
               } else {
                  cib $$6 = $$3.A();
                  int $$7 = $$6.a(jx.a($$4.dv()));
                  fdw $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fdw $$10 = chv.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jx.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jx.a(iu.a((jo)$$10)));
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
                     $$2x.a(new cge($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
