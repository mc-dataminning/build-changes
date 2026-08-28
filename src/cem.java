import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cem<T extends buk> extends cet<T> {
   @Override
   protected void a(arh $$0, T $$1) {
      double $$2 = $$1.h(bvr.m);
      eyn $$3 = $$1.cO().c($$2, $$2, $$2);
      List<buk> $$4 = $$0.a(buk.class, $$3, $$1x -> $$1x != $$1 && $$1x.bI());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bvl<?> $$5 = $$1.dX();
      $$5.a(cdn.g, $$4);
      $$5.a(cdn.h, new cdp($$1, $$4));
   }

   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.g, cdn.h);
   }
}
