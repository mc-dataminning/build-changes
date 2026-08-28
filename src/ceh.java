import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ceh<T extends buf> extends ceo<T> {
   @Override
   protected void a(arg $$0, T $$1) {
      double $$2 = $$1.h(bvm.m);
      exz $$3 = $$1.cO().c($$2, $$2, $$2);
      List<buf> $$4 = $$0.a(buf.class, $$3, $$1x -> $$1x != $$1 && $$1x.bI());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bvg<?> $$5 = $$1.dX();
      $$5.a(cdi.g, $$4);
      $$5.a(cdi.h, new cdk($$1, $$4));
   }

   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.g, cdi.h);
   }
}
