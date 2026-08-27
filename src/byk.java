import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class byk<T extends boi> extends byr<T> {
   @Override
   protected void a(aow $$0, T $$1) {
      enu $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<boi> $$3 = $$0.a(boi.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bpj<?> $$4 = $$1.dO();
      $$4.a(bxl.g, $$3);
      $$4.a(bxl.h, new bxn($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.g, bxl.h);
   }
}
