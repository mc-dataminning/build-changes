import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cdf<T extends btc> extends cdm<T> {
   @Override
   protected void a(aqm $$0, T $$1) {
      ewc $$2 = $$1.cM().c((double)this.b(), (double)this.c(), (double)this.b());
      List<btc> $$3 = $$0.a(btc.class, $$2, $$1x -> $$1x != $$1 && $$1x.bF());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bue<?> $$4 = $$1.dV();
      $$4.a(ccg.g, $$3);
      $$4.a(ccg.h, new cci($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.g, ccg.h);
   }
}
