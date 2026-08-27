import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ccr<T extends bso> extends ccy<T> {
   @Override
   protected void a(aqm $$0, T $$1) {
      euf $$2 = $$1.cK().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bso> $$3 = $$0.a(bso.class, $$2, $$1x -> $$1x != $$1 && $$1x.bD());
      $$3.sort(Comparator.comparingDouble($$1::g));
      btq<?> $$4 = $$1.dS();
      $$4.a(cbs.g, $$3);
      $$4.a(cbs.h, new cbu($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.g, cbs.h);
   }
}
