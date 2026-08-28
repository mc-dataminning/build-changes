import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cey<T extends buv> extends cff<T> {
   @Override
   protected void a(arm $$0, T $$1) {
      double $$2 = $$1.h(bwd.m);
      ezc $$3 = $$1.cS().c($$2, $$2, $$2);
      List<buv> $$4 = $$0.a(buv.class, $$3, $$1x -> $$1x != $$1 && $$1x.bM());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bvx<?> $$5 = $$1.ed();
      $$5.a(cdz.g, $$4);
      $$5.a(cdz.h, new ceb($$1, $$4));
   }

   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.g, cdz.h);
   }
}
