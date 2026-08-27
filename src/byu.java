import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class byu extends bzg<box> {
   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.x, bya.y);
   }

   @Override
   protected void a(apa $$0, box $$1) {
      bpy<?> $$2 = $$1.dM();
      bne $$3 = $$1.ew();
      if ($$3 != null) {
         $$2.a(bya.x, $$1.ew());
         bof $$4 = $$3.d();
         if ($$4 instanceof box) {
            $$2.a(bya.y, (box)$$4);
         }
      } else {
         $$2.b(bya.x);
      }

      $$2.c(bya.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dJ() != $$0) {
            $$2.b(bya.y);
         }
      });
   }
}
