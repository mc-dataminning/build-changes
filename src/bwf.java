import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bwf extends bwc<blv> {
   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.i);
   }

   @Override
   protected void a(amp $$0, blv $$1) {
      $$1.dO().a(bux.i, this.a($$1));
   }

   private List<blv> a(blv $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(blv $$0) {
      return $$0.ai() == blj.bg && $$0.o_();
   }

   private buz c(blv $$0) {
      return $$0.dO().c(bux.h).orElse(buz.a());
   }
}
