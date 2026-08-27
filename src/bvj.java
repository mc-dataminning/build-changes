import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bvj<T extends bll> extends bvq<T> {
   @Override
   protected void a(ami $$0, T $$1) {
      eju $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bll> $$3 = $$0.a(bll.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bml<?> $$4 = $$1.dP();
      $$4.a(bum.g, $$3);
      $$4.a(bum.h, new buo($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.g, bum.h);
   }
}
