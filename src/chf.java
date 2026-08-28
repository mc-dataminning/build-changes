import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class chf<T extends bxe> extends chm<T> {
   @Override
   protected void a(arq $$0, T $$1) {
      double $$2 = $$1.h(byk.m);
      fel $$3 = $$1.cR().c($$2, $$2, $$2);
      List<bxe> $$4 = $$0.a(bxe.class, $$3, $$1x -> $$1x != $$1 && $$1x.bK());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bye<?> $$5 = $$1.ec();
      $$5.a(cgg.g, $$4);
      $$5.a(cgg.h, new cgi($$0, $$1, $$4));
   }

   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.g, cgg.h);
   }
}
