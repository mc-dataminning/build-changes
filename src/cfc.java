import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfc extends cfo<bve> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.x, cei.y);
   }

   @Override
   protected void a(arq $$0, bve $$1) {
      bwg<?> $$2 = $$1.ee();
      bsy $$3 = $$1.eJ();
      if ($$3 != null) {
         $$2.a(cei.x, $$1.eJ());
         bui $$4 = $$3.d();
         if ($$4 instanceof bve) {
            $$2.a(cei.y, (bve)$$4);
         }
      } else {
         $$2.b(cei.x);
      }

      $$2.c(cei.y).ifPresent($$2x -> {
         if (!$$2x.bN() || $$2x.dY() != $$0) {
            $$2.b(cei.y);
         }
      });
   }
}
