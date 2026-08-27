import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bqy {
   public static bog<cfd> a(bvq<List<ig>> $$0, float $$1, int $$2, int $$3, bvq<ig> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return brs.a(
         (Function<brs.b<cfd>, ? extends App<brs.c<cfd>, brv<cfd>>>)($$6 -> $$6.group($$6.a(bvq.m), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<ig> $$11 = $$6.b($$6x);
                     ig $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        ig $$13 = $$11.get($$8.F_().a($$11.size()));
                        if ($$13 != null && $$8.ae() == $$13.a() && $$12.b().a($$9.dj(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new bvt($$13.b(), $$1, $$2));
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
