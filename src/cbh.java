import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbh {
   private static final int a = 180;
   private static final int b = 8;
   private static final int c = 6;

   public static cab<bxh> a(cgb<jd> $$0, float $$1, int $$2) {
      MutableLong $$3 = new MutableLong(0L);
      return ccd.a(
         (Function<ccd.b<bxh>, ? extends App<ccd.c<bxh>, ccg<bxh>>>)($$4 -> $$4.group($$4.a(cgb.n), $$4.b($$0)).apply($$4, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                  jd $$9 = $$4.b($$5);
                  if ($$6.aj() != $$9.a() || !$$9.b().a($$7.dt(), (double)$$2)) {
                     return false;
                  } else if ($$8 <= $$3.getValue()) {
                     return true;
                  } else {
                     Optional<fdw> $$10 = Optional.ofNullable(chv.a($$7, 8, 6));
                     $$4x.a($$10.map($$1xxxx -> new cge($$1xxxx, $$1, 1)));
                     $$3.setValue($$8 + 180L);
                     return true;
                  }
               }))
      );
   }
}
