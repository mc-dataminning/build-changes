import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bpg {
   public static bmq<blh> a(btz<ia> $$0, float $$1, int $$2, int $$3) {
      MutableLong $$4 = new MutableLong(0L);
      return bqb.a(
         (Function<bqb.b<blh>, ? extends App<bqb.c<blh>, bqe<blh>>>)($$5 -> $$5.group($$5.a(btz.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  ia $$10 = $$5.b($$6);
                  if ($$7.ac() != $$10.a() || !$$10.b().a($$8.dj(), (double)$$3)) {
                     return false;
                  } else if ($$9 <= $$4.getValue()) {
                     return true;
                  } else {
                     $$5x.a(new buc($$10.b(), $$1, $$2));
                     $$4.setValue($$9 + 80L);
                     return true;
                  }
               }))
      );
   }
}
