import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bqs {
   private static final int a = 180;
   private static final int b = 8;
   private static final int c = 6;

   public static bpm<bmt> a(bvm<ig> $$0, float $$1, int $$2) {
      MutableLong $$3 = new MutableLong(0L);
      return bro.a(
         (Function<bro.b<bmt>, ? extends App<bro.c<bmt>, brr<bmt>>>)($$4 -> $$4.group($$4.a(bvm.m), $$4.b($$0)).apply($$4, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                  ig $$9 = $$4.b($$5);
                  if ($$6.ae() != $$9.a() || !$$9.b().a($$7.dk(), (double)$$2)) {
                     return false;
                  } else if ($$8 <= $$3.getValue()) {
                     return true;
                  } else {
                     Optional<els> $$10 = Optional.ofNullable(bxf.a($$7, 8, 6));
                     $$4x.a($$10.map($$1xxxx -> new bvp($$1xxxx, $$1, 1)));
                     $$3.setValue($$8 + 180L);
                     return true;
                  }
               }))
      );
   }
}
