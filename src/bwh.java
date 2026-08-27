import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bwh extends bws<bml> {
   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.x, bvn.y);
   }

   @Override
   protected void a(and $$0, bml $$1) {
      bnl<?> $$2 = $$1.dO();
      bkt $$3 = $$1.ex();
      if ($$3 != null) {
         $$2.a(bvn.x, $$1.ex());
         blv $$4 = $$3.d();
         if ($$4 instanceof bml) {
            $$2.a(bvn.y, (bml)$$4);
         }
      } else {
         $$2.b(bvn.x);
      }

      $$2.c(bvn.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dM() != $$0) {
            $$2.b(bvn.y);
         }
      });
   }
}
