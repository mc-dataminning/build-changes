import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class caq extends cbc<bqt> {
   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.x, bzw.y);
   }

   @Override
   protected void a(apu $$0, bqt $$1) {
      bru<?> $$2 = $$1.dP();
      boy $$3 = $$1.ez();
      if ($$3 != null) {
         $$2.a(bzw.x, $$1.ez());
         bqa $$4 = $$3.d();
         if ($$4 instanceof bqt) {
            $$2.a(bzw.y, (bqt)$$4);
         }
      } else {
         $$2.b(bzw.x);
      }

      $$2.c(bzw.y).ifPresent($$2x -> {
         if (!$$2x.bA() || $$2x.dM() != $$0) {
            $$2.b(bzw.y);
         }
      });
   }
}
