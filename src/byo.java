import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class byo {
   private static final int a = 180;
   private static final int b = 8;
   private static final int c = 6;

   public static bxi<bun> a(cdi<jm> $$0, float $$1, int $$2) {
      MutableLong $$3 = new MutableLong(0L);
      return bzk.a(
         (Function<bzk.b<bun>, ? extends App<bzk.c<bun>, bzn<bun>>>)($$4 -> $$4.group($$4.a(cdi.m), $$4.b($$0)).apply($$4, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                  jm $$9 = $$4.b($$5);
                  if ($$6.ag() != $$9.a() || !$$9.b().a($$7.dq(), (double)$$2)) {
                     return false;
                  } else if ($$8 <= $$3.getValue()) {
                     return true;
                  } else {
                     Optional<eye> $$10 = Optional.ofNullable(cfc.a($$7, 8, 6));
                     $$4x.a($$10.map($$1xxxx -> new cdl($$1xxxx, $$1, 1)));
                     $$3.setValue($$8 + 180L);
                     return true;
                  }
               }))
      );
   }
}
