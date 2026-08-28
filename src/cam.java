import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cam {
   public static bxv<bwj> a(cff<jp> $$0, float $$1, int $$2, int $$3) {
      MutableLong $$4 = new MutableLong(0L);
      return cbh.a(
         (Function<cbh.b<bwj>, ? extends App<cbh.c<bwj>, cbk<bwj>>>)($$5 -> $$5.group($$5.a(cff.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  jp $$10 = $$5.b($$6);
                  if ($$7.ah() != $$10.a() || !$$10.b().a($$8.dt(), (double)$$3)) {
                     return false;
                  } else if ($$9 <= $$4.getValue()) {
                     return true;
                  } else {
                     $$5x.a(new cfi($$10.b(), $$1, $$2));
                     $$4.setValue($$9 + 80L);
                     return true;
                  }
               }))
      );
   }
}
