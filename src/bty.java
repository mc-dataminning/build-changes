import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bty {
   private static final int a = 180;
   private static final int b = 8;
   private static final int c = 6;

   public static bss<bpx> a(bys<ik> $$0, float $$1, int $$2) {
      MutableLong $$3 = new MutableLong(0L);
      return buu.a(
         (Function<buu.b<bpx>, ? extends App<buu.c<bpx>, bux<bpx>>>)($$4 -> $$4.group($$4.a(bys.m), $$4.b($$0)).apply($$4, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                  ik $$9 = $$4.b($$5);
                  if ($$6.ad() != $$9.a() || !$$9.b().a($$7.dk(), (double)$$2)) {
                     return false;
                  } else if ($$8 <= $$3.getValue()) {
                     return true;
                  } else {
                     Optional<ept> $$10 = Optional.ofNullable(cam.a($$7, 8, 6));
                     $$4x.a($$10.map($$1xxxx -> new byv($$1xxxx, $$1, 1)));
                     $$3.setValue($$8 + 180L);
                     return true;
                  }
               }))
      );
   }
}
