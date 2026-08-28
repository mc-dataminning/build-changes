import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class chv<T extends bxu> extends cic<T> {
   @Override
   protected void a(ars $$0, T $$1) {
      double $$2 = $$1.h(bza.m);
      ffl $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bxu> $$4 = $$0.a(bxu.class, $$3, $$1x -> $$1x != $$1 && $$1x.bJ());
      $$4.sort(Comparator.comparingDouble($$1::g));
      byu<?> $$5 = $$1.ec();
      $$5.a(cgw.g, $$4);
      $$5.a(cgw.h, new cgy($$0, $$1, $$4));
   }

   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.g, cgw.h);
   }
}
