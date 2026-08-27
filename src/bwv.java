import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bwv extends bws<bml> {
   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.i);
   }

   @Override
   protected void a(and $$0, bml $$1) {
      $$1.dO().a(bvn.i, this.a($$1));
   }

   private List<bml> a(bml $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bml $$0) {
      return $$0.ai() == blz.bg && $$0.o_();
   }

   private bvp c(bml $$0) {
      return $$0.dO().c(bvn.h).orElse(bvp.a());
   }
}
