import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cea extends cdx<btn> {
   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.i);
   }

   @Override
   protected void a(are $$0, btn $$1) {
      $$1.dS().a(ccr.i, this.a($$1));
   }

   private List<btn> a(btn $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(btn $$0) {
      return $$0.ak() == bsy.bj && $$0.p_();
   }

   private cct c(btn $$0) {
      return $$0.dS().c(ccr.h).orElse(cct.a());
   }
}
