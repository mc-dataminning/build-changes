import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bwy {
   private static final int a = 180;
   private static final int b = 8;
   private static final int c = 6;

   public static bvs<bsx> a(cbs<iw> $$0, float $$1, int $$2) {
      MutableLong $$3 = new MutableLong(0L);
      return bxu.a(
         (Function<bxu.b<bsx>, ? extends App<bxu.c<bsx>, bxx<bsx>>>)($$4 -> $$4.group($$4.a(cbs.m), $$4.b($$0)).apply($$4, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                  iw $$9 = $$4.b($$5);
                  if ($$6.ae() != $$9.a() || !$$9.b().a($$7.dn(), (double)$$2)) {
                     return false;
                  } else if ($$8 <= $$3.getValue()) {
                     return true;
                  } else {
                     Optional<euk> $$10 = Optional.ofNullable(cdm.a($$7, 8, 6));
                     $$4x.a($$10.map($$1xxxx -> new cbv($$1xxxx, $$1, 1)));
                     $$3.setValue($$8 + 180L);
                     return true;
                  }
               }))
      );
   }
}
