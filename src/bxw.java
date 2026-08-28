import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxw {
   public static bve<cmf> a(cco<List<jh>> $$0, float $$1, int $$2, int $$3, cco<jh> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return byq.a(
         (Function<byq.b<cmf>, ? extends App<byq.c<cmf>, byt<cmf>>>)($$6 -> $$6.group($$6.a(cco.m), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<jh> $$11 = $$6.b($$6x);
                     jh $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        jh $$13 = $$11.get($$8.E_().a($$11.size()));
                        if ($$13 != null && $$8.af() == $$13.a() && $$12.b().a($$9.dn(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new ccr($$13.b(), $$1, $$2));
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
