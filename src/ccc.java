import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ccc<T extends bsa> extends ccj<T> {
   @Override
   protected void a(aqh $$0, T $$1) {
      etk $$2 = $$1.cI().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bsa> $$3 = $$0.a(bsa.class, $$2, $$1x -> $$1x != $$1 && $$1x.bB());
      $$3.sort(Comparator.comparingDouble($$1::g));
      btb<?> $$4 = $$1.dQ();
      $$4.a(cbd.g, $$3);
      $$4.a(cbd.h, new cbf($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.g, cbd.h);
   }
}
