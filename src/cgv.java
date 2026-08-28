import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cgv extends chh<bwz> {
   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.y, cgb.z);
   }

   @Override
   protected void a(aro $$0, bwz $$1) {
      bxz<?> $$2 = $$1.eb();
      bup $$3 = $$1.eH();
      if ($$3 != null) {
         $$2.a(cgb.y, $$1.eH());
         bwa $$4 = $$3.d();
         if ($$4 instanceof bwz) {
            $$2.a(cgb.z, (bwz)$$4);
         }
      } else {
         $$2.b(cgb.y);
      }

      $$2.c(cgb.z).ifPresent($$2x -> {
         if (!$$2x.bK() || $$2x.dV() != $$0) {
            $$2.b(cgb.z);
         }
      });
   }
}
