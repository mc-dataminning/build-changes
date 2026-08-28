import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfv extends cgh<bvx> {
   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.x, cfb.y);
   }

   @Override
   protected void a(arx $$0, bvx $$1) {
      bwz<?> $$2 = $$1.ec();
      btr $$3 = $$1.eG();
      if ($$3 != null) {
         $$2.a(cfb.x, $$1.eG());
         bvb $$4 = $$3.d();
         if ($$4 instanceof bvx) {
            $$2.a(cfb.y, (bvx)$$4);
         }
      } else {
         $$2.b(cfb.x);
      }

      $$2.c(cfb.y).ifPresent($$2x -> {
         if (!$$2x.bL() || $$2x.dW() != $$0) {
            $$2.b(cfb.y);
         }
      });
   }
}
