import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bsn {
   private static final int a = 180;
   private static final int b = 8;
   private static final int c = 6;

   public static brh<boo> a(bxh<ii> $$0, float $$1, int $$2) {
      MutableLong $$3 = new MutableLong(0L);
      return btj.a(
         (Function<btj.b<boo>, ? extends App<btj.c<boo>, btm<boo>>>)($$4 -> $$4.group($$4.a(bxh.m), $$4.b($$0)).apply($$4, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                  ii $$9 = $$4.b($$5);
                  if ($$6.ae() != $$9.a() || !$$9.b().a($$7.dk(), (double)$$2)) {
                     return false;
                  } else if ($$8 <= $$3.getValue()) {
                     return true;
                  } else {
                     Optional<ens> $$10 = Optional.ofNullable(bzb.a($$7, 8, 6));
                     $$4x.a($$10.map($$1xxxx -> new bxk($$1xxxx, $$1, 1)));
                     $$3.setValue($$8 + 180L);
                     return true;
                  }
               }))
      );
   }
}
