import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byv {
   public static bwd<cnh> a(cdn<List<jm>> $$0, float $$1, int $$2, int $$3, cdn<jm> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return bzp.a(
         (Function<bzp.b<cnh>, ? extends App<bzp.c<cnh>, bzs<cnh>>>)($$6 -> $$6.group($$6.a(cdn.m), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<jm> $$11 = $$6.b($$6x);
                     jm $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        jm $$13 = $$11.get($$8.C_().a($$11.size()));
                        if ($$13 != null && $$8.ag() == $$13.a() && $$12.b().a($$9.dq(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new cdq($$13.b(), $$1, $$2));
                              $$5.setValue($$10 + 100L);
                           }

                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
