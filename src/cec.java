import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cec extends cdz<btp> {
   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.i);
   }

   @Override
   protected void a(arf $$0, btp $$1) {
      $$1.dS().a(cct.i, this.a($$1));
   }

   private List<btp> a(btp $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(btp $$0) {
      return $$0.ak() == bta.bj && $$0.p_();
   }

   private ccv c(btp $$0) {
      return $$0.dS().c(cct.h).orElse(ccv.a());
   }
}
