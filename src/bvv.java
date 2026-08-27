import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bvv<T extends blv> extends bwc<T> {
   @Override
   protected void a(amp $$0, T $$1) {
      ekw $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<blv> $$3 = $$0.a(blv.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bmv<?> $$4 = $$1.dO();
      $$4.a(bux.g, $$3);
      $$4.a(bux.h, new buz($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.g, bux.h);
   }
}
