import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bpu {
   public static bnd<cdm> a(bum<List<ie>> $$0, float $$1, int $$2, int $$3, bum<ie> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return bqo.a(
         (Function<bqo.b<cdm>, ? extends App<bqo.c<cdm>, bqr<cdm>>>)($$6 -> $$6.group($$6.a(bum.m), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<ie> $$11 = $$6.b($$6x);
                     ie $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        ie $$13 = $$11.get($$8.F_().a($$11.size()));
                        if ($$13 != null && $$8.ad() == $$13.a() && $$12.b().a($$9.dl(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new bup($$13.b(), $$1, $$2));
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
