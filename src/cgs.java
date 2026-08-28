import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cgs<T extends bwr> extends cgz<T> {
   @Override
   protected void a(arn $$0, T $$1) {
      double $$2 = $$1.h(bxx.m);
      fcp $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bwr> $$4 = $$0.a(bwr.class, $$3, $$1x -> $$1x != $$1 && $$1x.bK());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bxr<?> $$5 = $$1.eb();
      $$5.a(cft.g, $$4);
      $$5.a(cft.h, new cfv($$0, $$1, $$4));
   }

   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.g, cft.h);
   }
}
