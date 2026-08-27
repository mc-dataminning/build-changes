import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bwp<T extends bmo> extends bww<T> {
   @Override
   protected void a(ane $$0, T $$1) {
      elx $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bmo> $$3 = $$0.a(bmo.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bno<?> $$4 = $$1.dN();
      $$4.a(bvq.g, $$3);
      $$4.a(bvq.h, new bvs($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.g, bvq.h);
   }
}
