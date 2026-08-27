import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class bqc extends bqf<bfz> {
   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.j, bpb.k, bpb.l);
   }

   @Override
   protected void a(aif $$0, bfz $$1) {
      List<byo> $$2 = $$0.v().stream().filter(bfm.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bha<?> $$3 = $$1.dK();
      $$3.a(bpb.j, $$2);
      List<byo> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bpb.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<byo> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bpb.l, $$5);
   }
}
