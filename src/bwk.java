import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bwk extends bww<bmo> {
   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.x, bvq.y);
   }

   @Override
   protected void a(ane $$0, bmo $$1) {
      bno<?> $$2 = $$1.dN();
      bkv $$3 = $$1.ex();
      if ($$3 != null) {
         $$2.a(bvq.x, $$1.ex());
         blw $$4 = $$3.d();
         if ($$4 instanceof bmo) {
            $$2.a(bvq.y, (bmo)$$4);
         }
      } else {
         $$2.b(bvq.x);
      }

      $$2.c(bvq.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dL() != $$0) {
            $$2.b(bvq.y);
         }
      });
   }
}
