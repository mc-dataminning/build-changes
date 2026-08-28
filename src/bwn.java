import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwn {
   private static final int a = 1;

   public static bvg<btl> a(float $$0) {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$1 -> $$1.group($$1.a(ccq.n), $$1.c(ccq.m), $$1.b(ccq.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bS()) {
                        return false;
                     } else {
                        bsq $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvq($$8, true));
                           $$3.a(new cct(new bvq($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
