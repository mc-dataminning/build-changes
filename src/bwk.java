import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bwk<T extends bmk> extends bwr<T> {
   @Override
   protected void a(and $$0, T $$1) {
      eln $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bmk> $$3 = $$0.a(bmk.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bnk<?> $$4 = $$1.dO();
      $$4.a(bvm.g, $$3);
      $$4.a(bvm.h, new bvo($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.g, bvm.h);
   }
}
