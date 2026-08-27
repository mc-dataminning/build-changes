import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cct<T extends bsq> extends cda<T> {
   @Override
   protected void a(aqn $$0, T $$1) {
      euh $$2 = $$1.cK().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bsq> $$3 = $$0.a(bsq.class, $$2, $$1x -> $$1x != $$1 && $$1x.bD());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bts<?> $$4 = $$1.dS();
      $$4.a(cbu.g, $$3);
      $$4.a(cbu.h, new cbw($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.g, cbu.h);
   }
}
