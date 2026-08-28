import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cdl extends cdi<bsy> {
   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.i);
   }

   @Override
   protected void a(aqk $$0, bsy $$1) {
      $$1.dT().a(ccc.i, this.a($$1));
   }

   private List<bsy> a(bsy $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bsy $$0) {
      return $$0.ak() == bsj.bj && $$0.p_();
   }

   private cce c(bsy $$0) {
      return $$0.dT().c(ccc.h).orElse(cce.a());
   }
}
