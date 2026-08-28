import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cdq<T extends btn> extends cdx<T> {
   @Override
   protected void a(are $$0, T $$1) {
      evk $$2 = $$1.cK().c((double)this.b(), (double)this.c(), (double)this.b());
      List<btn> $$3 = $$0.a(btn.class, $$2, $$1x -> $$1x != $$1 && $$1x.bD());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bup<?> $$4 = $$1.dS();
      $$4.a(ccr.g, $$3);
      $$4.a(ccr.h, new cct($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.g, ccr.h);
   }
}
