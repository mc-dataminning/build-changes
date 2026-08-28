import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cfk<T extends bvh> extends cfr<T> {
   @Override
   protected void a(ard $$0, T $$1) {
      double $$2 = $$1.h(bwp.m);
      fav $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bvh> $$4 = $$0.a(bvh.class, $$3, $$1x -> $$1x != $$1 && $$1x.bL());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bwj<?> $$5 = $$1.eb();
      $$5.a(cel.g, $$4);
      $$5.a(cel.h, new cen($$0, $$1, $$4));
   }

   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.g, cel.h);
   }
}
