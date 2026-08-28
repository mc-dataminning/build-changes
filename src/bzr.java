import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzr {
   public static bwz<cog> a(cej<List<jq>> $$0, float $$1, int $$2, int $$3, cej<jq> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return cal.a(
         (Function<cal.b<cog>, ? extends App<cal.c<cog>, cao<cog>>>)($$6 -> $$6.group($$6.a(cej.m), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<jq> $$11 = $$6.b($$6x);
                     jq $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        jq $$13 = $$11.get($$8.H_().a($$11.size()));
                        if ($$13 != null && $$8.ai() == $$13.a() && $$12.b().a($$9.du(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new cem($$13.b(), $$1, $$2));
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
