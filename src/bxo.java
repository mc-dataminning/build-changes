import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxo {
   public static bwy<coc> a(float $$0, int $$1) {
      return cak.a((Function<cak.b<coc>, ? extends App<cak.c<coc>, can<coc>>>)($$2 -> $$2.group($$2.c(cei.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dy())) {
                  return false;
               } else {
                  cgi $$6 = $$3.y();
                  int $$7 = $$6.a(kj.a($$4.dy()));
                  ezr $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     ezr $$10 = cgc.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kj.a($$1xxxx))));
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
                     $$2x.a(new cel($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
