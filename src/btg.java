import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class btg extends btr<bjm> {
   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.x, bsn.y);
   }

   @Override
   protected void a(akt $$0, bjm $$1) {
      bkm<?> $$2 = $$1.dN();
      bhu $$3 = $$1.ew();
      if ($$3 != null) {
         $$2.a(bsn.x, $$1.ew());
         biw $$4 = $$3.d();
         if ($$4 instanceof bjm) {
            $$2.a(bsn.y, (bjm)$$4);
         }
      } else {
         $$2.b(bsn.x);
      }

      $$2.c(bsn.y).ifPresent($$2x -> {
         if (!$$2x.bv() || $$2x.dL() != $$0) {
            $$2.b(bsn.y);
         }
      });
   }
}
