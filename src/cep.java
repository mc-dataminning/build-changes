import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cep<T extends bun> extends cew<T> {
   @Override
   protected void a(arj $$0, T $$1) {
      double $$2 = $$1.h(bvu.m);
      eyr $$3 = $$1.cO().c($$2, $$2, $$2);
      List<bun> $$4 = $$0.a(bun.class, $$3, $$1x -> $$1x != $$1 && $$1x.bI());
      $$4.sort(Comparator.comparingDouble($$1::g));
      bvo<?> $$5 = $$1.dY();
      $$5.a(cdq.g, $$4);
      $$5.a(cdq.h, new cds($$1, $$4));
   }

   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.g, cdq.h);
   }
}
