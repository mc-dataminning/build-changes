import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class btc extends btn<bji> {
   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.x, bsj.y);
   }

   @Override
   protected void a(aks $$0, bji $$1) {
      bki<?> $$2 = $$1.dN();
      bhq $$3 = $$1.ew();
      if ($$3 != null) {
         $$2.a(bsj.x, $$1.ew());
         bis $$4 = $$3.d();
         if ($$4 instanceof bji) {
            $$2.a(bsj.y, (bji)$$4);
         }
      } else {
         $$2.b(bsj.x);
      }

      $$2.c(bsj.y).ifPresent($$2x -> {
         if (!$$2x.bv() || $$2x.dL() != $$0) {
            $$2.b(bsj.y);
         }
      });
   }
}
