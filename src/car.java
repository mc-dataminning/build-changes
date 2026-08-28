import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class car {
   public static bya<bwo> a(cfk<jp> $$0, float $$1, int $$2, int $$3) {
      MutableLong $$4 = new MutableLong(0L);
      return cbm.a(
         (Function<cbm.b<bwo>, ? extends App<cbm.c<bwo>, cbp<bwo>>>)($$5 -> $$5.group($$5.a(cfk.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  jp $$10 = $$5.b($$6);
                  if ($$7.ah() != $$10.a() || !$$10.b().a($$8.du(), (double)$$3)) {
                     return false;
                  } else if ($$9 <= $$4.getValue()) {
                     return true;
                  } else {
                     $$5x.a(new cfn($$10.b(), $$1, $$2));
                     $$4.setValue($$9 + 80L);
                     return true;
                  }
               }))
      );
   }
}
