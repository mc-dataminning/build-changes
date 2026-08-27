import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cbk extends cbn<bre> {
   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.j, cah.k, cah.l);
   }

   @Override
   protected void a(aqe $$0, bre $$1) {
      List<ckl> $$2 = $$0.x().stream().filter(bqq.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bsf<?> $$3 = $$1.dQ();
      $$3.a(cah.j, $$2);
      List<ckl> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cah.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<ckl> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cah.l, $$5);
   }
}
