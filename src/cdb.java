import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cdb<T extends bsy> extends cdi<T> {
   @Override
   protected void a(aqk $$0, T $$1) {
      evu $$2 = $$1.cK().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bsy> $$3 = $$0.a(bsy.class, $$2, $$1x -> $$1x != $$1 && $$1x.bD());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bua<?> $$4 = $$1.dT();
      $$4.a(ccc.g, $$3);
      $$4.a(ccc.h, new cce($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.g, ccc.h);
   }
}
