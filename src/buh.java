import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class buh<T extends bkj> extends buo<T> {
   @Override
   protected void a(alq $$0, T $$1) {
      eia $$2 = $$1.cG().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bkj> $$3 = $$0.a(bkj.class, $$2, $$1x -> $$1x != $$1 && $$1x.bv());
      $$3.sort(Comparator.comparingDouble($$1::f));
      blj<?> $$4 = $$1.dN();
      $$4.a(btk.g, $$3);
      $$4.a(btk.h, new btm($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.g, btk.h);
   }
}
