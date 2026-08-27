import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class buw<T extends bky> extends bvd<T> {
   @Override
   protected void a(ama $$0, T $$1) {
      ejd $$2 = $$1.cG().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bky> $$3 = $$0.a(bky.class, $$2, $$1x -> $$1x != $$1 && $$1x.bv());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bly<?> $$4 = $$1.dN();
      $$4.a(btz.g, $$3);
      $$4.a(btz.h, new bub($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.g, btz.h);
   }
}
