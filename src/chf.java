import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class chf extends chr<bxj> {
   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.y, cgl.z);
   }

   @Override
   protected void a(arq $$0, bxj $$1) {
      byj<?> $$2 = $$1.eb();
      bux $$3 = $$1.eH();
      if ($$3 != null) {
         $$2.a(cgl.y, $$1.eH());
         bwi $$4 = $$3.d();
         if ($$4 instanceof bxj) {
            $$2.a(cgl.z, (bxj)$$4);
         }
      } else {
         $$2.b(cgl.y);
      }

      $$2.c(cgl.z).ifPresent($$2x -> {
         if (!$$2x.bI() || $$2x.dU() != $$0) {
            $$2.b(cgl.z);
         }
      });
   }
}
