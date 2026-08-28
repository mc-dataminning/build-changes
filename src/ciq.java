import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class ciq extends cin<byf> {
   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.i);
   }

   @Override
   protected void a(asb $$0, byf $$1) {
      $$1.ec().a(chh.i, this.a($$1));
   }

   private List<byf> a(byf $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(byf $$0) {
      return $$0.an() == bxn.bE && $$0.n_();
   }

   private chj c(byf $$0) {
      return $$0.ec().c(chh.h).orElse(chj.a());
   }
}
