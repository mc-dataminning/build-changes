import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bzr<T extends bpp> extends bzy<T> {
   @Override
   protected void a(apf $$0, T $$1) {
      epo $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bpp> $$3 = $$0.a(bpp.class, $$2, $$1x -> $$1x != $$1 && $$1x.bA());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bqq<?> $$4 = $$1.dP();
      $$4.a(bys.g, $$3);
      $$4.a(bys.h, new byu($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.g, bys.h);
   }
}
