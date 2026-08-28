import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byx {
   public static bwg<buv> a(cdq<jn> $$0, float $$1, int $$2, int $$3) {
      MutableLong $$4 = new MutableLong(0L);
      return bzs.a(
         (Function<bzs.b<buv>, ? extends App<bzs.c<buv>, bzv<buv>>>)($$5 -> $$5.group($$5.a(cdq.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  jn $$10 = $$5.b($$6);
                  if ($$7.ag() != $$10.a() || !$$10.b().a($$8.dq(), (double)$$3)) {
                     return false;
                  } else if ($$9 <= $$4.getValue()) {
                     return true;
                  } else {
                     $$5x.a(new cdt($$10.b(), $$1, $$2));
                     $$4.setValue($$9 + 80L);
                     return true;
                  }
               }))
      );
   }
}
