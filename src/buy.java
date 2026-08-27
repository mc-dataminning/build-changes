import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class buy {
   public static bui<clj> a(float $$0, int $$1) {
      return bxu.a((Function<bxu.b<clj>, ? extends App<bxu.c<clj>, bxx<clj>>>)($$2 -> $$2.group($$2.c(cbs.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.c($$4.dp())) {
                  return false;
               } else {
                  cds $$6 = $$3.y();
                  int $$7 = $$6.a(jq.a($$4.dp()));
                  euk $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     euk $$10 = cdm.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(jq.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(jq.a(io.a($$10)));
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
                     $$2x.a(new cbv($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
