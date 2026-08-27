import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bwl<T extends bml> extends bws<T> {
   @Override
   protected void a(and $$0, T $$1) {
      elo $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bml> $$3 = $$0.a(bml.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bnl<?> $$4 = $$1.dO();
      $$4.a(bvn.g, $$3);
      $$4.a(bvn.h, new bvp($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.g, bvn.h);
   }
}
