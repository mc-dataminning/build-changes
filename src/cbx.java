import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cbx extends ccj<bsa> {
   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.x, cbd.y);
   }

   @Override
   protected void a(aqh $$0, bsa $$1) {
      btb<?> $$2 = $$1.dQ();
      bqf $$3 = $$1.eA();
      if ($$3 != null) {
         $$2.a(cbd.x, $$1.eA());
         brh $$4 = $$3.d();
         if ($$4 instanceof bsa) {
            $$2.a(cbd.y, (bsa)$$4);
         }
      } else {
         $$2.b(cbd.x);
      }

      $$2.c(cbd.y).ifPresent($$2x -> {
         if (!$$2x.bB() || $$2x.dN() != $$0) {
            $$2.b(cbd.y);
         }
      });
   }
}
