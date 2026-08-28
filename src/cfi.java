import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cfi<T extends bvf> extends cfp<T> {
   @Override
   protected void a(arc $$0, T $$1) {
      double $$2 = $$1.h(bwn.m);
      fat $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bvf> $$4 = $$0.a(bvf.class, $$3, $$1x -> $$1x != $$1 && $$1x.bL());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bwh<?> $$5 = $$1.ec();
      $$5.a(cej.g, $$4);
      $$5.a(cej.h, new cel($$0, $$1, $$4));
   }

   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.g, cej.h);
   }
}
