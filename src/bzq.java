import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bzq<T extends bpo> extends bzx<T> {
   @Override
   protected void a(apf $$0, T $$1) {
      epm $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bpo> $$3 = $$0.a(bpo.class, $$2, $$1x -> $$1x != $$1 && $$1x.bA());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bqp<?> $$4 = $$1.dP();
      $$4.a(byr.g, $$3);
      $$4.a(byr.h, new byt($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.g, byr.h);
   }
}
