import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class byb extends byn<bog> {
   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.x, bxh.y);
   }

   @Override
   protected void a(aov $$0, bog $$1) {
      bpf<?> $$2 = $$1.dO();
      bmn $$3 = $$1.ey();
      if ($$3 != null) {
         $$2.a(bxh.x, $$1.ey());
         bno $$4 = $$3.d();
         if ($$4 instanceof bog) {
            $$2.a(bxh.y, (bog)$$4);
         }
      } else {
         $$2.b(bxh.x);
      }

      $$2.c(bxh.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dM() != $$0) {
            $$2.b(bxh.y);
         }
      });
   }
}
