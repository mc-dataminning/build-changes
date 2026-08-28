import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cdp<T extends btl> extends cdw<T> {
   @Override
   protected void a(aqt $$0, T $$1) {
      ewr $$2 = $$1.cL().c((double)this.b(), (double)this.c(), (double)this.b());
      List<btl> $$3 = $$0.a(btl.class, $$2, $$1x -> $$1x != $$1 && $$1x.bE());
      $$3.sort(Comparator.comparingDouble($$1::g));
      buo<?> $$4 = $$1.dU();
      $$4.a(ccq.g, $$3);
      $$4.a(ccq.h, new ccs($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.g, ccq.h);
   }
}
