import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cgn extends cgz<bwr> {
   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.y, cft.z);
   }

   @Override
   protected void a(arn $$0, bwr $$1) {
      bxr<?> $$2 = $$1.eb();
      buh $$3 = $$1.eH();
      if ($$3 != null) {
         $$2.a(cft.y, $$1.eH());
         bvs $$4 = $$3.d();
         if ($$4 instanceof bwr) {
            $$2.a(cft.z, (bwr)$$4);
         }
      } else {
         $$2.b(cft.y);
      }

      $$2.c(cft.z).ifPresent($$2x -> {
         if (!$$2x.bK() || $$2x.dV() != $$0) {
            $$2.b(cft.z);
         }
      });
   }
}
