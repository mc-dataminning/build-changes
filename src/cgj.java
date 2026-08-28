import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cgj<T extends bwg> extends cgq<T> {
   @Override
   protected void a(ash $$0, T $$1) {
      double $$2 = $$1.h(bxo.m);
      fbt $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bwg> $$4 = $$0.a(bwg.class, $$3, $$1x -> $$1x != $$1 && $$1x.bL());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bxi<?> $$5 = $$1.ec();
      $$5.a(cfk.g, $$4);
      $$5.a(cfk.h, new cfm($$0, $$1, $$4));
   }

   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.g, cfk.h);
   }
}
