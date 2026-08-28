import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cdu<T extends btr> extends ceb<T> {
   @Override
   protected void a(arf $$0, T $$1) {
      evo $$2 = $$1.cK().c((double)this.b(), (double)this.c(), (double)this.b());
      List<btr> $$3 = $$0.a(btr.class, $$2, $$1x -> $$1x != $$1 && $$1x.bD());
      $$3.sort(Comparator.comparingDouble($$1::g));
      but<?> $$4 = $$1.dS();
      $$4.a(ccv.g, $$3);
      $$4.a(ccv.h, new ccx($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.g, ccv.h);
   }
}
