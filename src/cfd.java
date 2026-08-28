import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cfd<T extends bva> extends cfk<T> {
   @Override
   protected void a(arn $$0, T $$1) {
      double $$2 = $$1.h(bwi.m);
      ezi $$3 = $$1.cS().c($$2, $$2, $$2);
      List<bva> $$4 = $$0.a(bva.class, $$3, $$1x -> $$1x != $$1 && $$1x.bM());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bwc<?> $$5 = $$1.ed();
      $$5.a(cee.g, $$4);
      $$5.a(cee.h, new ceg($$1, $$4));
   }

   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.g, cee.h);
   }
}
