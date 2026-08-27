import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bwy extends bww<bmx> {
   public static final int a = 10;
   private static final bxd c = bxd.b().a(10.0).d();
   private final cqh d;

   public bwy(cqh $$0) {
      this.d = $$0;
   }

   protected void a(ane $$0, bmx $$1) {
      bno<?> $$2 = $$1.dN();
      List<cfq> $$3 = $$0.x()
         .stream()
         .filter(bmb.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.w($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cfq $$4 = $$3.get(0);
         $$2.a(bvq.O, $$4);
      } else {
         $$2.b(bvq.O);
      }
   }

   private boolean a(cfq $$0) {
      return this.a($$0.eT()) || this.a($$0.eU());
   }

   private boolean a(cng $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.O);
   }
}
