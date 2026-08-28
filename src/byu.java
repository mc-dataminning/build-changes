import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byu {
   public static bwd<bus> a(cdn<jm> $$0, float $$1, int $$2, int $$3) {
      MutableLong $$4 = new MutableLong(0L);
      return bzp.a(
         (Function<bzp.b<bus>, ? extends App<bzp.c<bus>, bzs<bus>>>)($$5 -> $$5.group($$5.a(cdn.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  jm $$10 = $$5.b($$6);
                  if ($$7.ag() != $$10.a() || !$$10.b().a($$8.dq(), (double)$$3)) {
                     return false;
                  } else if ($$9 <= $$4.getValue()) {
                     return true;
                  } else {
                     $$5x.a(new cdq($$10.b(), $$1, $$2));
                     $$4.setValue($$9 + 80L);
                     return true;
                  }
               }))
      );
   }
}
