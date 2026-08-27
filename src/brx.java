import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brx {
   public static brh<cif> a(float $$0, int $$1) {
      return but.a((Function<but.b<cif>, ? extends App<but.c<cif>, buw<cif>>>)($$2 -> $$2.group($$2.c(byr.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dm())) {
                  return false;
               } else {
                  car $$6 = $$3.y();
                  int $$7 = $$6.a(je.a($$4.dm()));
                  epr $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     epr $$10 = cal.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(je.a($$1xxxx))));
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
                     $$2x.a(new byu($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
