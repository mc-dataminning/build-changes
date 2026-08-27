import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bve<T extends blg> extends bvl<T> {
   @Override
   protected void a(ame $$0, T $$1) {
      ejp $$2 = $$1.cH().c((double)this.b(), (double)this.c(), (double)this.b());
      List<blg> $$3 = $$0.a(blg.class, $$2, $$1x -> $$1x != $$1 && $$1x.bx());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bmg<?> $$4 = $$1.dP();
      $$4.a(buh.g, $$3);
      $$4.a(buh.h, new buj($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.g, buh.h);
   }
}
