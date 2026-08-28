import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cdx extends cdu<btk> {
   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.i);
   }

   @Override
   protected void a(arb $$0, btk $$1) {
      $$1.dS().a(cco.i, this.a($$1));
   }

   private List<btk> a(btk $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(btk $$0) {
      return $$0.ak() == bsv.bj && $$0.p_();
   }

   private ccq c(btk $$0) {
      return $$0.dS().c(cco.h).orElse(ccq.a());
   }
}
