import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cig<T extends byf> extends cin<T> {
   @Override
   protected void a(asb $$0, T $$1) {
      double $$2 = $$1.h(bzl.m);
      ffx $$3 = $$1.cR().c($$2, $$2, $$2);
      List<byf> $$4 = $$0.a(byf.class, $$3, $$1x -> $$1x != $$1 && $$1x.bJ());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bzf<?> $$5 = $$1.ec();
      $$5.a(chh.g, $$4);
      $$5.a(chh.h, new chj($$0, $$1, $$4));
   }

   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.g, chh.h);
   }
}
