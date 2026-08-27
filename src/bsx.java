import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bsx<T extends biy> extends bte<T> {
   @Override
   protected void a(akk $$0, T $$1) {
      egz $$2 = $$1.cG().c((double)this.b(), (double)this.c(), (double)this.b());
      List<biy> $$3 = $$0.a(biy.class, $$2, $$1x -> $$1x != $$1 && $$1x.bv());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bjz<?> $$4 = $$1.dM();
      $$4.a(bsa.g, $$3);
      $$4.a(bsa.h, new bsc($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.g, bsa.h);
   }
}
