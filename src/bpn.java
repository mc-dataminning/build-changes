import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpn {
   private static final int a = 1;

   public static bog<bmo> a(float $$0) {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$1 -> $$1.group($$1.a(bvq.n), $$1.c(bvq.m), $$1.b(bvq.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        blw $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.m($$8);
                        } else {
                           $$2.a(new boq($$8, true));
                           $$3.a(new bvt(new boq($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
