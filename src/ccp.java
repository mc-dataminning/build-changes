import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class ccp {
   public static bzx<cru> a(chh<List<jf>> $$0, float $$1, int $$2, int $$3, chh<jf> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return cdj.a(
         (Function<cdj.b<cru>, ? extends App<cdj.c<cru>, cdm<cru>>>)($$6 -> $$6.group($$6.a(chh.n), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<jf> $$11 = $$6.b($$6x);
                     jf $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        jf $$13 = $$11.get($$8.G_().a($$11.size()));
                        if ($$13 != null && $$8.aj() == $$13.a() && $$12.b().a($$9.dt(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new chk($$13.b(), $$1, $$2));
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
