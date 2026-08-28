import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cdr<T extends bto> extends cdy<T> {
   @Override
   protected void a(are $$0, T $$1) {
      evl $$2 = $$1.cK().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bto> $$3 = $$0.a(bto.class, $$2, $$1x -> $$1x != $$1 && $$1x.bD());
      $$3.sort(Comparator.comparingDouble($$1::g));
      buq<?> $$4 = $$1.dS();
      $$4.a(ccs.g, $$3);
      $$4.a(ccs.h, new ccu($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.g, ccs.h);
   }
}
