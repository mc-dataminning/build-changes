import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cdt<T extends btq> extends cea<T> {
   @Override
   protected void a(arf $$0, T $$1) {
      evn $$2 = $$1.cK().c((double)this.b(), (double)this.c(), (double)this.b());
      List<btq> $$3 = $$0.a(btq.class, $$2, $$1x -> $$1x != $$1 && $$1x.bD());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bus<?> $$4 = $$1.dS();
      $$4.a(ccu.g, $$3);
      $$4.a(ccu.h, new ccw($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.g, ccu.h);
   }
}
