import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cdw extends cdz<btp> {
   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.j, cct.k, cct.l);
   }

   @Override
   protected void a(arf $$0, btp $$1) {
      List<cmx> $$2 = $$0.x().stream().filter(bsz.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      bur<?> $$3 = $$1.dS();
      $$3.a(cct.j, $$2);
      List<cmx> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(cct.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cmx> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(cct.l, $$5);
   }
}
