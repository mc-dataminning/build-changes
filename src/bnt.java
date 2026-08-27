import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnt {
   public static bnd<cdm> a(float $$0, int $$1) {
      return bqo.a((Function<bqo.b<cdm>, ? extends App<bqo.c<cdm>, bqr<cdm>>>)($$2 -> $$2.group($$2.c(bum.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.b($$4.dn())) {
                  return false;
               } else {
                  bwk $$6 = $$3.x();
                  int $$7 = $$6.a(iy.a($$4.dn()));
                  ejz $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ejz $$10 = bwe.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(iy.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(iy.a(hx.a($$10)));
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
                     $$2x.a(new bup($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
