import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class btp extends btn<bjr> {
   public static final int a = 10;
   private static final btu c = btu.b().a(10.0).d();
   private final cmi d;

   public btp(cmi $$0) {
      this.d = $$0;
   }

   protected void a(aks $$0, bjr $$1) {
      bki<?> $$2 = $$1.dN();
      List<cbw> $$3 = $$0.v()
         .stream()
         .filter(biv.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cbw $$4 = $$3.get(0);
         $$2.a(bsj.N, $$4);
      } else {
         $$2.b(bsj.N);
      }
   }

   private boolean a(cbw $$0) {
      return this.a($$0.eS()) || this.a($$0.eT());
   }

   private boolean a(cjh $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.N);
   }
}
