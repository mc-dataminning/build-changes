import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bwz {
   public static buh<cll> a(cbr<List<iz>> $$0, float $$1, int $$2, int $$3, cbr<iz> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return bxt.a(
         (Function<bxt.b<cll>, ? extends App<bxt.c<cll>, bxw<cll>>>)($$6 -> $$6.group($$6.a(cbr.m), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<iz> $$11 = $$6.b($$6x);
                     iz $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        iz $$13 = $$11.get($$8.F_().a($$11.size()));
                        if ($$13 != null && $$8.af() == $$13.a() && $$12.b().a($$9.ds(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new cbu($$13.b(), $$1, $$2));
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
