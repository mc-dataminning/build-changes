import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class byf extends byr<boi> {
   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.x, bxl.y);
   }

   @Override
   protected void a(aow $$0, boi $$1) {
      bpj<?> $$2 = $$1.dO();
      bmp $$3 = $$1.ey();
      if ($$3 != null) {
         $$2.a(bxl.x, $$1.ey());
         bnq $$4 = $$3.d();
         if ($$4 instanceof boi) {
            $$2.a(bxl.y, (boi)$$4);
         }
      } else {
         $$2.b(bxl.x);
      }

      $$2.c(bxl.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dM() != $$0) {
            $$2.b(bxl.y);
         }
      });
   }
}
