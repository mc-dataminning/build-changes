import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cfu extends cfr<bvh> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.i);
   }

   @Override
   protected void a(arp $$0, bvh $$1) {
      $$1.eb().a(cel.i, this.a($$1));
   }

   private List<bvh> a(bvh $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bvh $$0) {
      return $$0.aq() == bus.bz && $$0.e_();
   }

   private cen c(bvh $$0) {
      return $$0.eb().c(cel.h).orElse(cen.a());
   }
}
