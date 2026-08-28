import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cdp extends cdm<btc> {
   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.i);
   }

   @Override
   protected void a(aqm $$0, btc $$1) {
      $$1.dV().a(ccg.i, this.a($$1));
   }

   private List<btc> a(btc $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(btc $$0) {
      return $$0.am() == bsn.bj && $$0.o_();
   }

   private cci c(btc $$0) {
      return $$0.dV().c(ccg.h).orElse(cci.a());
   }
}
