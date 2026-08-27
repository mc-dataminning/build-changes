import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class btk<T extends bjm> extends btr<T> {
   @Override
   protected void a(akt $$0, T $$1) {
      ehc $$2 = $$1.cG().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bjm> $$3 = $$0.a(bjm.class, $$2, $$1x -> $$1x != $$1 && $$1x.bv());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bkm<?> $$4 = $$1.dN();
      $$4.a(bsn.g, $$3);
      $$4.a(bsn.h, new bsp($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.g, bsn.h);
   }
}
