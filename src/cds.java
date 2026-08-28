import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cds<T extends btp> extends cdz<T> {
   @Override
   protected void a(arf $$0, T $$1) {
      evm $$2 = $$1.cK().c((double)this.b(), (double)this.c(), (double)this.b());
      List<btp> $$3 = $$0.a(btp.class, $$2, $$1x -> $$1x != $$1 && $$1x.bD());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bur<?> $$4 = $$1.dS();
      $$4.a(cct.g, $$3);
      $$4.a(cct.h, new ccv($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.g, cct.h);
   }
}
