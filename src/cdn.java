import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cdn<T extends btk> extends cdu<T> {
   @Override
   protected void a(arb $$0, T $$1) {
      evh $$2 = $$1.cK().c((double)this.b(), (double)this.c(), (double)this.b());
      List<btk> $$3 = $$0.a(btk.class, $$2, $$1x -> $$1x != $$1 && $$1x.bD());
      $$3.sort(Comparator.comparingDouble($$1::g));
      bum<?> $$4 = $$1.dS();
      $$4.a(cco.g, $$3);
      $$4.a(cco.h, new ccq($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.g, cco.h);
   }
}
