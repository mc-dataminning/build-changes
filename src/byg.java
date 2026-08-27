import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class byg<T extends bog> extends byn<T> {
   @Override
   protected void a(aov $$0, T $$1) {
      enn $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bog> $$3 = $$0.a(bog.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bpf<?> $$4 = $$1.dO();
      $$4.a(bxh.g, $$3);
      $$4.a(bxh.h, new bxj($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.g, bxh.h);
   }
}
