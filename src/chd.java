import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class chd<T extends bxc> extends chk<T> {
   @Override
   protected void a(arq $$0, T $$1) {
      double $$2 = $$1.h(byi.m);
      fed $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bxc> $$4 = $$0.a(bxc.class, $$3, $$1x -> $$1x != $$1 && $$1x.bK());
      $$4.sort(Comparator.comparingDouble($$1::g));
      byc<?> $$5 = $$1.eb();
      $$5.a(cge.g, $$4);
      $$5.a(cge.h, new cgg($$0, $$1, $$4));
   }

   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.g, cge.h);
   }
}
