import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bng {
   public static bkq<bjh> a(brz<hd> $$0, float $$1, int $$2, int $$3) {
      MutableLong $$4 = new MutableLong(0L);
      return bob.a(
         (Function<bob.b<bjh>, ? extends App<bob.c<bjh>, boe<bjh>>>)($$5 -> $$5.group($$5.a(brz.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  hd $$10 = $$5.b($$6);
                  if ($$7.ac() != $$10.a() || !$$10.b().a($$8.di(), (double)$$3)) {
                     return false;
                  } else if ($$9 <= $$4.getValue()) {
                     return true;
                  } else {
                     $$5x.a(new bsc($$10.b(), $$1, $$2));
                     $$4.setValue($$9 + 80L);
                     return true;
                  }
               }))
      );
   }
}
