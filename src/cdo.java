import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cdo extends cdl<btb> {
   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.i);
   }

   @Override
   protected void a(aqm $$0, btb $$1) {
      $$1.dU().a(ccf.i, this.a($$1));
   }

   private List<btb> a(btb $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(btb $$0) {
      return $$0.al() == bsm.bj && $$0.p_();
   }

   private cch c(btb $$0) {
      return $$0.dU().c(ccf.h).orElse(cch.a());
   }
}
