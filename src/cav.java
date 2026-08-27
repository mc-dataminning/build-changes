import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cav<T extends bqt> extends cbc<T> {
   @Override
   protected void a(apu $$0, T $$1) {
      ese $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bqt> $$3 = $$0.a(bqt.class, $$2, $$1x -> $$1x != $$1 && $$1x.bA());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bru<?> $$4 = $$1.dP();
      $$4.a(bzw.g, $$3);
      $$4.a(bzw.h, new bzy($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.g, bzw.h);
   }
}
