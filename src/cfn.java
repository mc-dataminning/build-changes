import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cfn extends cfq<bvg> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.j, cek.k, cek.l);
   }

   @Override
   protected void a(ard $$0, bvg $$1) {
      List<cow> $$2 = $$0.z()
         .stream()
         .filter(bup.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      bwi<?> $$3 = $$1.eb();
      $$3.a(cek.j, $$2);
      List<cow> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cek.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cow> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).findFirst();
      $$3.a(cek.l, $$5);
   }

   protected double a(bvg $$0) {
      return $$0.h(bwo.m);
   }
}
