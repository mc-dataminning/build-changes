import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cgd extends cgp<bwf> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.x, cfj.y);
   }

   @Override
   protected void a(ash $$0, bwf $$1) {
      bxh<?> $$2 = $$1.ec();
      btz $$3 = $$1.eG();
      if ($$3 != null) {
         $$2.a(cfj.x, $$1.eG());
         bvj $$4 = $$3.d();
         if ($$4 instanceof bwf) {
            $$2.a(cfj.y, (bwf)$$4);
         }
      } else {
         $$2.b(cfj.x);
      }

      $$2.c(cfj.y).ifPresent($$2x -> {
         if (!$$2x.bL() || $$2x.dW() != $$0) {
            $$2.b(cfj.y);
         }
      });
   }
}
