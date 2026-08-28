import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cey extends cfk<bva> {
   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.x, cee.y);
   }

   @Override
   protected void a(arn $$0, bva $$1) {
      bwc<?> $$2 = $$1.ed();
      bsu $$3 = $$1.eI();
      if ($$3 != null) {
         $$2.a(cee.x, $$1.eI());
         bue $$4 = $$3.d();
         if ($$4 instanceof bva) {
            $$2.a(cee.y, (bva)$$4);
         }
      } else {
         $$2.b(cee.x);
      }

      $$2.c(cee.y).ifPresent($$2x -> {
         if (!$$2x.bM() || $$2x.dX() != $$0) {
            $$2.b(cee.y);
         }
      });
   }
}
