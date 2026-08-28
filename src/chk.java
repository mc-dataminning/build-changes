import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class chk<T extends bxj> extends chr<T> {
   @Override
   protected void a(arq $$0, T $$1) {
      double $$2 = $$1.h(byp.m);
      fes $$3 = $$1.cQ().c($$2, $$2, $$2);
      List<bxj> $$4 = $$0.a(bxj.class, $$3, $$1x -> $$1x != $$1 && $$1x.bI());
      $$4.sort(Comparator.comparingDouble($$1::g));
      byj<?> $$5 = $$1.eb();
      $$5.a(cgl.g, $$4);
      $$5.a(cgl.h, new cgn($$0, $$1, $$4));
   }

   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.g, cgl.h);
   }
}
