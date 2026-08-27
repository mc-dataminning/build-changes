import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class btg<T extends bji> extends btn<T> {
   @Override
   protected void a(aks $$0, T $$1) {
      ehk $$2 = $$1.cG().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bji> $$3 = $$0.a(bji.class, $$2, $$1x -> $$1x != $$1 && $$1x.bv());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bki<?> $$4 = $$1.dN();
      $$4.a(bsj.g, $$3);
      $$4.a(bsj.h, new bsl($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.g, bsj.h);
   }
}
