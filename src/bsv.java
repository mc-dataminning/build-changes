import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bsv<T extends biw> extends btc<T> {
   @Override
   protected void a(aki $$0, T $$1) {
      eha $$2 = $$1.cG().c((double)this.b(), (double)this.c(), (double)this.b());
      List<biw> $$3 = $$0.a(biw.class, $$2, $$1x -> $$1x != $$1 && $$1x.bv());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bjx<?> $$4 = $$1.dM();
      $$4.a(bry.g, $$3);
      $$4.a(bry.h, new bsa($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.g, bry.h);
   }
}
