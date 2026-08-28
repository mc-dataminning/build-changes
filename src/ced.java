import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class ced extends cea<btq> {
   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.i);
   }

   @Override
   protected void a(arf $$0, btq $$1) {
      $$1.dS().a(ccu.i, this.a($$1));
   }

   private List<btq> a(btq $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(btq $$0) {
      return $$0.ak() == btb.bj && $$0.p_();
   }

   private ccw c(btq $$0) {
      return $$0.dS().c(ccu.h).orElse(ccw.a());
   }
}
