import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bni {
   public static bkr<cba> a(bsa<List<hd>> $$0, float $$1, int $$2, int $$3, bsa<hd> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return boc.a(
         (Function<boc.b<cba>, ? extends App<boc.c<cba>, bof<cba>>>)($$6 -> $$6.group($$6.a(bsa.m), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<hd> $$11 = $$6.b($$6x);
                     hd $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        hd $$13 = $$11.get($$8.y_().a($$11.size()));
                        if ($$13 != null && $$8.ac() == $$13.a() && $$12.b().a($$9.di(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new bsd($$13.b(), $$1, $$2));
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
