import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cek extends cew<bun> {
   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.x, cdq.y);
   }

   @Override
   protected void a(arj $$0, bun $$1) {
      bvo<?> $$2 = $$1.dY();
      bsj $$3 = $$1.eD();
      if ($$3 != null) {
         $$2.a(cdq.x, $$1.eD());
         btr $$4 = $$3.d();
         if ($$4 instanceof bun) {
            $$2.a(cdq.y, (bun)$$4);
         }
      } else {
         $$2.b(cdq.x);
      }

      $$2.c(cdq.y).ifPresent($$2x -> {
         if (!$$2x.bI() || $$2x.dS() != $$0) {
            $$2.b(cdq.y);
         }
      });
   }
}
