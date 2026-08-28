import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbb {
   public static byj<cpu> a(cft<List<jr>> $$0, float $$1, int $$2, int $$3, cft<jr> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return cbv.a(
         (Function<cbv.b<cpu>, ? extends App<cbv.c<cpu>, cby<cpu>>>)($$6 -> $$6.group($$6.a(cft.n), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<jr> $$11 = $$6.b($$6x);
                     jr $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        jr $$13 = $$11.get($$8.C_().a($$11.size()));
                        if ($$13 != null && $$8.aj() == $$13.a() && $$12.b().a($$9.dt(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new cfw($$13.b(), $$1, $$2));
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
