import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvx {
   public static bvh<cmi> a(float $$0, int $$1) {
      return byt.a((Function<byt.b<cmi>, ? extends App<byt.c<cmi>, byw<cmi>>>)($$2 -> $$2.group($$2.c(ccr.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dp())) {
                  return false;
               } else {
                  cer $$6 = $$3.y();
                  int $$7 = $$6.a(kb.a($$4.dp()));
                  evp $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     evp $$10 = cel.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(kb.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(kb.a(iz.a($$10)));
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
                     $$2x.a(new ccu($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
