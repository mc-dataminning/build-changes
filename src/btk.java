import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class btk extends btn<bji> {
   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.j, bsj.k, bsj.l);
   }

   @Override
   protected void a(aks $$0, bji $$1) {
      List<cbw> $$2 = $$0.v().stream().filter(biv.f).filter($$1x -> $$1.a($$1x, 16.0)).sorted(Comparator.comparingDouble($$1::f)).collect(Collectors.toList());
      bki<?> $$3 = $$1.dN();
      $$3.a(bsj.j, $$2);
      List<cbw> $$4 = $$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bsj.k, $$4.isEmpty() ? null : $$4.get(0));
      Optional<cbw> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bsj.l, $$5);
   }
}
