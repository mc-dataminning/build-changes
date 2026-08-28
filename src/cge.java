import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cge<T extends bwb> extends cgl<T> {
   @Override
   protected void a(ash $$0, T $$1) {
      double $$2 = $$1.h(bxj.m);
      fbn $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bwb> $$4 = $$0.a(bwb.class, $$3, $$1x -> $$1x != $$1 && $$1x.bL());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bxd<?> $$5 = $$1.eb();
      $$5.a(cff.g, $$4);
      $$5.a(cff.h, new cfh($$0, $$1, $$4));
   }

   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.g, cff.h);
   }
}
