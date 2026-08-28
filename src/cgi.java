import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cgi<T extends bwf> extends cgp<T> {
   @Override
   protected void a(ash $$0, T $$1) {
      double $$2 = $$1.h(bxn.m);
      fbs $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bwf> $$4 = $$0.a(bwf.class, $$3, $$1x -> $$1x != $$1 && $$1x.bL());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bxh<?> $$5 = $$1.ec();
      $$5.a(cfj.g, $$4);
      $$5.a(cfj.h, new cfl($$0, $$1, $$4));
   }

   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.g, cfj.h);
   }
}
