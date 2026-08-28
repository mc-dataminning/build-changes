import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class chn extends chk<bxc> {
   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.i);
   }

   @Override
   protected void a(arq $$0, bxc $$1) {
      $$1.eb().a(cge.i, this.a($$1));
   }

   private List<bxc> a(bxc $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bxc $$0) {
      return $$0.aq() == bwm.bD && $$0.n_();
   }

   private cgg c(bxc $$0) {
      return $$0.eb().c(cge.h).orElse(cgg.a());
   }
}
