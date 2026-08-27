import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bpt {
   public static bnd<blu> a(bum<ie> $$0, float $$1, int $$2, int $$3) {
      MutableLong $$4 = new MutableLong(0L);
      return bqo.a(
         (Function<bqo.b<blu>, ? extends App<bqo.c<blu>, bqr<blu>>>)($$5 -> $$5.group($$5.a(bum.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  ie $$10 = $$5.b($$6);
                  if ($$7.ad() != $$10.a() || !$$10.b().a($$8.dl(), (double)$$3)) {
                     return false;
                  } else if ($$9 <= $$4.getValue()) {
                     return true;
                  } else {
                     $$5x.a(new bup($$10.b(), $$1, $$2));
                     $$4.setValue($$9 + 80L);
                     return true;
                  }
               }))
      );
   }
}
