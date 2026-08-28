import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxp {
   public static bwz<cog> a(float $$0, int $$1) {
      return cal.a((Function<cal.b<cog>, ? extends App<cal.c<cog>, cao<cog>>>)($$2 -> $$2.group($$2.c(cej.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dw())) {
                  return false;
               } else {
                  cgj $$6 = $$3.A();
                  int $$7 = $$6.a(kk.a($$4.dw()));
                  fay $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     fay $$10 = cgd.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kk.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kk.a(ji.a((kb)$$10)));
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
                     $$2x.a(new cem($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
