import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class cau extends cax<bqo> {
   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.j, bzr.k, bzr.l);
   }

   @Override
   protected void a(aps $$0, bqo $$1) {
      List<cjt> $$2 = $$0.x().stream().filter(bqa.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::g)).collect(Collectors.toList());
      brp<?> $$3 = $$1.dP();
      $$3.a(bzr.j, $$2);
      List<cjt> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bzr.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cjt> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bzr.l, $$5);
   }
}
