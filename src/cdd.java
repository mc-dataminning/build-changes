import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cdd extends cda<bsq> {
   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.i);
   }

   @Override
   protected void a(aqn $$0, bsq $$1) {
      $$1.dS().a(cbu.i, this.a($$1));
   }

   private List<bsq> a(bsq $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bsq $$0) {
      return $$0.ak() == bsc.bj && $$0.p_();
   }

   private cbw c(bsq $$0) {
      return $$0.dS().c(cbu.h).orElse(cbw.a());
   }
}
