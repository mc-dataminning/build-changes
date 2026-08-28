import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cff extends cfr<bvh> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.x, cel.y);
   }

   @Override
   protected void a(ard $$0, bvh $$1) {
      bwj<?> $$2 = $$1.eb();
      btb $$3 = $$1.eF();
      if ($$3 != null) {
         $$2.a(cel.x, $$1.eF());
         bul $$4 = $$3.d();
         if ($$4 instanceof bvh) {
            $$2.a(cel.y, (bvh)$$4);
         }
      } else {
         $$2.b(cel.x);
      }

      $$2.c(cel.y).ifPresent($$2x -> {
         if (!$$2x.bL() || $$2x.dV() != $$0) {
            $$2.b(cel.y);
         }
      });
   }
}
