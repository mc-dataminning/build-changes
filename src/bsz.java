import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bsz<T extends bjb> extends btg<T> {
   @Override
   protected void a(akn $$0, T $$1) {
      ehd $$2 = $$1.cG().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bjb> $$3 = $$0.a(bjb.class, $$2, $$1x -> $$1x != $$1 && $$1x.bv());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bkb<?> $$4 = $$1.dM();
      $$4.a(bsc.g, $$3);
      $$4.a(bsc.h, new bse($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.g, bsc.h);
   }
}
