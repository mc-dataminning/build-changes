import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cga<T extends bvx> extends cgh<T> {
   @Override
   protected void a(arx $$0, T $$1) {
      double $$2 = $$1.h(bxf.m);
      fbm $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bvx> $$4 = $$0.a(bvx.class, $$3, $$1x -> $$1x != $$1 && $$1x.bL());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bwz<?> $$5 = $$1.ec();
      $$5.a(cfb.g, $$4);
      $$5.a(cfb.h, new cfd($$0, $$1, $$4));
   }

   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.g, cfb.h);
   }
}
