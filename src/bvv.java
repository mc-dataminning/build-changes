import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvv {
   public static bxi<buh> a(int $$0, float $$1) {
      return bzk.a(
         (Function<bzk.b<buh>, ? extends App<bzk.c<buh>, bzn<buh>>>)($$2 -> $$2.group($$2.c(cdi.m), $$2.a(cdi.n), $$2.b(cdi.o), $$2.b(cdi.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     buf $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cdk>b($$6).a($$9)) {
                        $$4.a(new bwi($$9, true));
                        $$7.M().a(-$$1, 0.0F);
                        $$7.v(azc.c($$7.dI(), $$7.aW, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
