import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cee extends ceb<btr> {
   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.i);
   }

   @Override
   protected void a(arf $$0, btr $$1) {
      $$1.dS().a(ccv.i, this.a($$1));
   }

   private List<btr> a(btr $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(btr $$0) {
      return $$0.ak() == btc.bj && $$0.p_();
   }

   private ccx c(btr $$0) {
      return $$0.dS().c(ccv.h).orElse(ccx.a());
   }
}
