import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bwb extends bwm<bmf> {
   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.x, bvh.y);
   }

   @Override
   protected void a(amz $$0, bmf $$1) {
      bnf<?> $$2 = $$1.dO();
      bkn $$3 = $$1.ex();
      if ($$3 != null) {
         $$2.a(bvh.x, $$1.ex());
         blp $$4 = $$3.d();
         if ($$4 instanceof bmf) {
            $$2.a(bvh.y, (bmf)$$4);
         }
      } else {
         $$2.b(bvh.x);
      }

      $$2.c(bvh.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dM() != $$0) {
            $$2.b(bvh.y);
         }
      });
   }
}
