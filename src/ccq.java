import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ccq<T extends bso> extends ccx<T> {
   @Override
   protected void a(aqt $$0, T $$1) {
      ewp $$2 = $$1.cP().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bso> $$3 = $$0.a(bso.class, $$2, $$1x -> $$1x != $$1 && $$1x.bI());
      $$3.sort(Comparator.comparingDouble($$1::g));
      btp<?> $$4 = $$1.dZ();
      $$4.a(cbr.g, $$3);
      $$4.a(cbr.h, new cbt($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.g, cbr.h);
   }
}
