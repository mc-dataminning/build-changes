import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bsv extends btg<bjb> {
   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.x, bsc.y);
   }

   @Override
   protected void a(akn $$0, bjb $$1) {
      bkb<?> $$2 = $$1.dM();
      bhj $$3 = $$1.ev();
      if ($$3 != null) {
         $$2.a(bsc.x, $$1.ev());
         bil $$4 = $$3.d();
         if ($$4 instanceof bjb) {
            $$2.a(bsc.y, (bjb)$$4);
         }
      } else {
         $$2.b(bsc.x);
      }

      $$2.c(bsc.y).ifPresent($$2x -> {
         if (!$$2x.bv() || $$2x.dK() != $$0) {
            $$2.b(bsc.y);
         }
      });
   }
}
