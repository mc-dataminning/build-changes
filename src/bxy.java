import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bxy {
   public static bvg<cmi> a(ccq<List<jl>> $$0, float $$1, int $$2, int $$3, ccq<jl> $$4) {
      MutableLong $$5 = new MutableLong(0L);
      return bys.a(
         (Function<bys.b<cmi>, ? extends App<bys.c<cmi>, byv<cmi>>>)($$6 -> $$6.group($$6.a(ccq.m), $$6.b($$0), $$6.b($$4))
               .apply($$6, ($$5xx, $$6x, $$7) -> ($$8, $$9, $$10) -> {
                     List<jl> $$11 = $$6.b($$6x);
                     jl $$12 = $$6.b($$7);
                     if ($$11.isEmpty()) {
                        return false;
                     } else {
                        jl $$13 = $$11.get($$8.E_().a($$11.size()));
                        if ($$13 != null && $$8.af() == $$13.a() && $$12.b().a($$9.do(), (double)$$3)) {
                           if ($$10 > $$5.getValue()) {
                              $$5xx.a(new cct($$13.b(), $$1, $$2));
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
