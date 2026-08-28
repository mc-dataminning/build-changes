import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class chc extends cgz<bwr> {
   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.i);
   }

   @Override
   protected void a(arn $$0, bwr $$1) {
      $$1.eb().a(cft.i, this.a($$1));
   }

   private List<bwr> a(bwr $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bwr $$0) {
      return $$0.aq() == bwb.bC && $$0.n_();
   }

   private cfv c(bwr $$0) {
      return $$0.eb().c(cft.h).orElse(cfv.a());
   }
}
