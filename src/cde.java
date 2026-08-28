import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cde<T extends btb> extends cdl<T> {
   @Override
   protected void a(aqm $$0, T $$1) {
      ewa $$2 = $$1.cL().c((double)this.b(), (double)this.c(), (double)this.b());
      List<btb> $$3 = $$0.a(btb.class, $$2, $$1x -> $$1x != $$1 && $$1x.bE());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bud<?> $$4 = $$1.dU();
      $$4.a(ccf.g, $$3);
      $$4.a(ccf.h, new cch($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.g, ccf.h);
   }
}
