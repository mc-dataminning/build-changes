import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bwz extends bww<bmo> {
   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.i);
   }

   @Override
   protected void a(ane $$0, bmo $$1) {
      $$1.dN().a(bvq.i, this.a($$1));
   }

   private List<bmo> a(bmo $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bmo $$0) {
      return $$0.ai() == bmc.bh && $$0.o_();
   }

   private bvs c(bmo $$0) {
      return $$0.dN().c(bvq.h).orElse(bvs.a());
   }
}
