import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bvg extends bvd<bky> {
   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.i);
   }

   @Override
   protected void a(ama $$0, bky $$1) {
      $$1.dN().a(btz.i, this.a($$1));
   }

   private List<bky> a(bky $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bky $$0) {
      return $$0.ag() == bkm.bf && $$0.n_();
   }

   private bub c(bky $$0) {
      return $$0.dN().c(btz.h).orElse(bub.a());
   }
}
