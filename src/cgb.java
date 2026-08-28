import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cgb<T extends bvy> extends cgi<T> {
   @Override
   protected void a(ard $$0, T $$1) {
      double $$2 = $$1.h(bxg.m);
      fbs $$3 = $$1.cQ().c($$2, $$2, $$2);
      List<bvy> $$4 = $$0.a(bvy.class, $$3, $$1x -> $$1x != $$1 && $$1x.bJ());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bxa<?> $$5 = $$1.ea();
      $$5.a(cfc.g, $$4);
      $$5.a(cfc.h, new cfe($$0, $$1, $$4));
   }

   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.g, cfc.h);
   }
}
