import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bve {
   public static bsm<cjn> a(bzw<List<im>> $$0, float $$1, int $$2, int $$3, bzw<im> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return bvy.a(
         (Function<bvy.b<cjn>, ? extends App<bvy.c<cjn>, bwb<cjn>>>)($$6 -> $$6.group($$6.a(bzw.m), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<im> $$11 = $$6.b($$6x);
                     im $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        im $$13 = $$11.get($$8.E_().a($$11.size()));
                        if ($$13 != null && $$8.ae() == $$13.a() && $$12.b().a($$9.dk(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new bzz($$13.b(), $$1, $$2));
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
