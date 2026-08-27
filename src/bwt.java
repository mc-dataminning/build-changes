import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bwt extends bwr<bmt> {
   public static final int a = 10;
   private static final bwy c = bwy.b().a(10.0).d();
   private final cpy d;

   public bwt(cpy $$0) {
      this.d = $$0;
   }

   protected void a(and $$0, bmt $$1) {
      bnk<?> $$2 = $$1.dO();
      List<cfh> $$3 = $$0.x()
         .stream()
         .filter(blx.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .filter($$1x -> !$$1.x($$1x))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         cfh $$4 = $$3.get(0);
         $$2.a(bvm.N, $$4);
      } else {
         $$2.b(bvm.N);
      }
   }

   private boolean a(cfh $$0) {
      return this.a($$0.eT()) || this.a($$0.eU());
   }

   private boolean a(cmx $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.N);
   }
}
