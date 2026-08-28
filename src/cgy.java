import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cgy extends chk<bxc> {
   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.y, cge.z);
   }

   @Override
   protected void a(arq $$0, bxc $$1) {
      byc<?> $$2 = $$1.eb();
      bus $$3 = $$1.eH();
      if ($$3 != null) {
         $$2.a(cge.y, $$1.eH());
         bwd $$4 = $$3.d();
         if ($$4 instanceof bxc) {
            $$2.a(cge.z, (bxc)$$4);
         }
      } else {
         $$2.b(cge.y);
      }

      $$2.c(cge.z).ifPresent($$2x -> {
         if (!$$2x.bK() || $$2x.dV() != $$0) {
            $$2.b(cge.z);
         }
      });
   }
}
