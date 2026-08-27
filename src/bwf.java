import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bwf<T extends bmf> extends bwm<T> {
   @Override
   protected void a(amz $$0, T $$1) {
      elh $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bmf> $$3 = $$0.a(bmf.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bnf<?> $$4 = $$1.dO();
      $$4.a(bvh.g, $$3);
      $$4.a(bvh.h, new bvj($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.g, bvh.h);
   }
}
