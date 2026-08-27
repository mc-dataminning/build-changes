import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bos {
   public static boc<ceu> a(float $$0, int $$1) {
      return bro.a((Function<bro.b<ceu>, ? extends App<bro.c<ceu>, brr<ceu>>>)($$2 -> $$2.group($$2.c(bvm.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dm())) {
                  return false;
               } else {
                  bxl $$6 = $$3.y();
                  int $$7 = $$6.a(iz.a($$4.dm()));
                  els $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     els $$10 = bxf.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(iz.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(iz.a(hx.a($$10)));
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
                     $$2x.a(new bvp($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
