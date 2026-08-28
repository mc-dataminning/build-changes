import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfz extends cgl<bwb> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.x, cff.y);
   }

   @Override
   protected void a(ash $$0, bwb $$1) {
      bxd<?> $$2 = $$1.eb();
      btv $$3 = $$1.eF();
      if ($$3 != null) {
         $$2.a(cff.x, $$1.eF());
         bvf $$4 = $$3.d();
         if ($$4 instanceof bwb) {
            $$2.a(cff.y, (bwb)$$4);
         }
      } else {
         $$2.b(cff.x);
      }

      $$2.c(cff.y).ifPresent($$2x -> {
         if (!$$2x.bL() || $$2x.dV() != $$0) {
            $$2.b(cff.y);
         }
      });
   }
}
