import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bwp extends bwm<bmf> {
   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.i);
   }

   @Override
   protected void a(amz $$0, bmf $$1) {
      $$1.dO().a(bvh.i, this.a($$1));
   }

   private List<bmf> a(bmf $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bmf $$0) {
      return $$0.ai() == blt.bg && $$0.o_();
   }

   private bvj c(bmf $$0) {
      return $$0.dO().c(bvh.h).orElse(bvj.a());
   }
}
