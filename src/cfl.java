import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cfl<T extends bvi> extends cfs<T> {
   @Override
   protected void a(ard $$0, T $$1) {
      double $$2 = $$1.h(bwq.m);
      faw $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bvi> $$4 = $$0.a(bvi.class, $$3, $$1x -> $$1x != $$1 && $$1x.bL());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bwk<?> $$5 = $$1.eb();
      $$5.a(cem.g, $$4);
      $$5.a(cem.h, new ceo($$0, $$1, $$4));
   }

   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.g, cem.h);
   }
}
