import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cha<T extends bwz> extends chh<T> {
   @Override
   protected void a(aro $$0, T $$1) {
      double $$2 = $$1.h(byf.m);
      fdr $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bwz> $$4 = $$0.a(bwz.class, $$3, $$1x -> $$1x != $$1 && $$1x.bK());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bxz<?> $$5 = $$1.eb();
      $$5.a(cgb.g, $$4);
      $$5.a(cgb.h, new cgd($$0, $$1, $$4));
   }

   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.g, cgb.h);
   }
}
